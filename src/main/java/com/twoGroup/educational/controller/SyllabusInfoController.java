package com.twoGroup.educational.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.github.pagehelper.PageHelper;
import com.twoGroup.educational.commonUtils.DataTransUtil;
import com.twoGroup.educational.entities.DisciplineInfo;
import com.twoGroup.educational.entities.SyllabusInfo;
import com.twoGroup.educational.service.DisciplineInfoService;
import com.twoGroup.educational.service.SyllabusInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Author: 黄彬朕
 * @Date: 19.05.27
 * 教务管理模块->课程表
 */
@RestController
@RequestMapping("lessonTableInfo")
public class SyllabusInfoController{
    private Logger logger = LoggerFactory.getLogger(SyllabusInfoController.class);

    @Autowired
    /*课程表业务接口*/
    SyllabusInfoService syllabusInfoService;

    //所有课程表
    private List<SyllabusInfo> syllabusInfos;

    //课程表
    private SyllabusInfo syllabusInfo;

    /**
     * 分页查询所有课程表
     */
    @GetMapping("info/listLessonTableManage/{currentPage}")
    public @ResponseBody String listLessonTableManage(Map map, @PathVariable int currentPage) {
        //每页显示五行数据
        PageHelper.startPage(currentPage, 5);
        //获取数据
        syllabusInfos = syllabusInfoService.selectList(null);
        if (syllabusInfos != null) {
            //数据绑定
            return DataTransUtil.dataUtil(map, syllabusInfos);
        }
        return "false";
    }

    /**
     * 条件查询
     */
    @PostMapping("info/listLessonTableManageLike")
    public @ResponseBody String listLessonTableManageLike(Map<String,Object> map,int currentPage , SyllabusInfo syllabusInfo){
        //判断有无条件
        Wrapper<SyllabusInfo> syllabusInfoWrapper = null;
        if (!"".equals(syllabusInfo.getSyllabusName())) {
            syllabusInfoWrapper = new EntityWrapper<SyllabusInfo>().like("syllabus_name", syllabusInfo.getSyllabusName().trim());
        }
        //每页显示五行数据
        PageHelper.startPage(currentPage, 5);
        //获取数据
        syllabusInfos = syllabusInfoService.selectList(syllabusInfoWrapper); //也可以用匿名类
        if (syllabusInfos != null) {
            //数据绑定
            return DataTransUtil.dataUtil(map, syllabusInfos);
        }
        return "false";
    }

    /**
     * 更新、添加课程表的条件查询
     */
    @GetMapping("saveOrUpdate/condition/{syllabusId}")
    public @ResponseBody String condition(@PathVariable String syllabusId,Map map) {
        //修改操作、有disciplineId参数
        try {
            if (!"".equals(syllabusId)){
                syllabusInfo=syllabusInfoService.selectById(syllabusId);
                return DataTransUtil.oneObjDataUtil(map,"syllabusInfo",syllabusInfo);
            }else{
            }
        } catch (Exception e) {
            return "false";
        }
        return "false";
    }

    /**
     * 添加课程表
     */
    @PostMapping("saveLessonTable")
    public @ResponseBody String saveLessonTable(SyllabusInfo syllabusInfo){
        if (syllabusInfoService.selectOne(new EntityWrapper<SyllabusInfo>().eq("syllabus_name",syllabusInfo.getSyllabusName()))==null){
            try {
                boolean b = syllabusInfoService.insert(syllabusInfo);
                if (b==true){
                    return "true";
                }else {
                    return "false";
                }
            } catch (Exception e) {
                return "false";
            }
        }else {
            return "false";
        }

    }

    /**
     * 更新课程表
     */
    @PutMapping("updateLessonTable/{syllabusId}")
    public @ResponseBody String updateLessonTable(@PathVariable String syllabusId,SyllabusInfo syllabusInfo){
        System.out.println(syllabusInfo);
        try {
            boolean b = syllabusInfoService.updateById(syllabusInfo);
            if (b==true){
                return "true";
            }else {
                return "false";
            }
        } catch (Exception e) {
            return "false";
        }
    }

    /**
     * 删除课程表
     */
    @DeleteMapping("info/deleteLessonTable/{syllabusId}")
    public @ResponseBody String deleteLessonTable(@PathVariable String syllabusId) {
        try {
            boolean b = syllabusInfoService.deleteById(Integer.parseInt(syllabusId));
            if (b == false) {
                return "false";
            }
            return "true";
        } catch (Exception e) {
            return "false";
        }
    }

}
