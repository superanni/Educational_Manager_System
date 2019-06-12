package com.twoGroup.educational.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.github.pagehelper.PageHelper;
import com.twoGroup.educational.commonUtils.DataTransUtil;
import com.twoGroup.educational.commonUtils.RedisUtils;
import com.twoGroup.educational.entities.EvaluationInfo;
import com.twoGroup.educational.entities.SyllabusInfo;
import com.twoGroup.educational.service.EvaluationInfoService;
import com.twoGroup.educational.service.SyllabusInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

/** @Author: 黄彬朕
 * @Date: 19.05.27
 * 教务管理模块->学生评教(月度)
 */
@RestController
@RequestMapping("/evaluationMonthInfo")
public class EvaluationMonthController {
    private Logger logger = LoggerFactory.getLogger(EvaluationMonthController.class);

    @Autowired
    //课程表业务接口
    EvaluationInfoService evaluationInfoService;
    //redis
    @Autowired
    RedisUtils redisUtils;

    //所有学生月度评价表
    private List<EvaluationInfo> evaluationInfos;

    /**
     * 分页查询所有课程表
     */
    @GetMapping("info/listEvaluationInfoManage/{currentPage}")
    public @ResponseBody
    String listEvaluationInfoManage(Map map, @PathVariable int currentPage) {
        try {
            evaluationInfos = (List<EvaluationInfo>) redisUtils.get("evaluationInfos");
            //在redis缓存中查询是否有数据
            if (null==evaluationInfos){
                //线程锁定只让第一位用户在数据库中访问数据
                synchronized (this){
                    evaluationInfos = (List<EvaluationInfo>) redisUtils.get("evaluationInfos");
                    if (null==evaluationInfos){
                        evaluationInfos = evaluationInfoService.selectLinkList();
                        redisUtils.set("syllabusInfos",evaluationInfos);
                    }
                }
            }
            //封装的总页数、总记录数、当前页数
            DataTransUtil.redisDataUtil(map,evaluationInfos,currentPage,5);
            //如果redis有缓存数据则分页查询出数据
            evaluationInfos= (List<EvaluationInfo>) redisUtils.selectByPage("evaluationInfos",currentPage,5);
            if (evaluationInfos != null) {
                map.put("teachers",evaluationInfoService.selectTeacherList());
                map.put("lessons",evaluationInfoService.selectLessonList());
                map.put("classes",evaluationInfoService.selectClassList());
                //数据绑定
                map.put("list", evaluationInfos);
                return JSON.toJSONString(map);
            }
        }catch (Exception e){
            PageHelper.startPage(currentPage,5);
            evaluationInfos = evaluationInfoService.selectLinkList();
            if (evaluationInfos != null) {
                //数据绑定
                map.put("teachers",evaluationInfoService.selectTeacherList());
                map.put("lessons",evaluationInfoService.selectLessonList());
                map.put("classes",evaluationInfoService.selectClassList());
                return DataTransUtil.dataUtil(map,evaluationInfos);
            }
            return "false";
        }
        return "false";
    }

    /**
     * 条件查询
     */
    @PostMapping("info/listEvaluationInfoManageLike")
    public @ResponseBody String listEvaluationInfoManageLike(Map<String,Object> map, EvaluationInfo evaluationInfo){
        //判断有无条件
        System.out.println("evaluationInfo"+evaluationInfo);
        Wrapper<EvaluationInfo> evaluationInfoWrapper = null;
        /*if (!"".equals(syllabusInfo.getSyllabusName())) {
            syllabusInfoWrapper = new EntityWrapper<SyllabusInfo>().like("syllabus_name", syllabusInfo.getSyllabusName().trim());
            //每页显示五行数据
            PageHelper.startPage(currentPage, 5);
            //获取数据
            syllabusInfos = syllabusInfoService.selectList(syllabusInfoWrapper); //也可以用匿名类
            if (syllabusInfos != null) {
                //数据绑定
                return DataTransUtil.dataUtil(map, syllabusInfos);
            }
        }else {
            return listEvaluationInfoManage(map,currentPage);
        }*/
        return "false";
    }

}

