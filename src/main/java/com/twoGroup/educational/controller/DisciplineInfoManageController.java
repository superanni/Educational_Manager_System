package com.twoGroup.educational.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.github.pagehelper.PageHelper;
import com.twoGroup.educational.commonUtils.DataTransUtil;
import com.twoGroup.educational.entities.DisciplineInfo;
import com.twoGroup.educational.service.DisciplineInfoService;
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
 * 教务管理模块->课程管理
 */
@RestController
@RequestMapping("disciplineInfo")
public class DisciplineInfoManageController {
 	private Logger logger = LoggerFactory.getLogger(DisciplineInfoManageController.class);

    @Autowired
    /*课程信息业务接口*/
    DisciplineInfoService lessonInfoService;

    //所有课程信息
    private List<DisciplineInfo> lessonInfos;

    //课程信息
    private DisciplineInfo lessonInfo;


    /**
     * 分页查询所有课程信息
     */
    @GetMapping("info/listLessonManage/{currentPage}")
    public @ResponseBody String listLessonManage(Map map, @PathVariable int currentPage) {
	    System.out.println("查询课程"+currentPage);
        //每页显示五行数据
        PageHelper.startPage(currentPage, 5);
        //获取数据
        lessonInfos = lessonInfoService.selectList(null);
        if (lessonInfos != null) {
            //数据绑定
            return DataTransUtil.dataUtil(map, lessonInfos);
        }
        return "false";
    }

    /**
     * 条件查询
     */
    @PostMapping("info/listLessonManageLike")
    public @ResponseBody String listLessonManageLike(Map<String,Object> map,int currentPage , DisciplineInfo disciplineInfo){
        //判断有无条件
        Wrapper<DisciplineInfo> disciplineInfoWrapper = null;
        if (!"".equals(disciplineInfo.getDisciplineName())) {
            disciplineInfoWrapper = new EntityWrapper<DisciplineInfo>().like("discipline_name", disciplineInfo.getDisciplineName().trim());
        }
        //每页显示五行数据
        PageHelper.startPage(currentPage, 5);
        //获取数据
        lessonInfos = lessonInfoService.selectList(disciplineInfoWrapper); //也可以用匿名类
        if (lessonInfos != null) {
            //数据绑定
            return DataTransUtil.dataUtil(map, lessonInfos);
        }
        return "false";
    }

    /**
     * 更新、添加课程信息的条件查询
     */
    @GetMapping("saveOrUpdate/condition/{disciplineId}")
    public @ResponseBody String condition(@PathVariable String disciplineId,Map map) {
        //修改操作、有disciplineId参数
        try {
            if (!"".equals(disciplineId)){
                lessonInfo=lessonInfoService.selectById(disciplineId);
                return DataTransUtil.oneObjDataUtil(map,"lessonInfo",lessonInfo);
            }else{
            }
        } catch (Exception e) {
            return "false";
        }
        return "false";
    }

    /**
     * 添加课程信息
     */
    @PostMapping("saveLesson")
    public @ResponseBody String saveLesson(DisciplineInfo disciplineInfo){
        if (lessonInfoService.selectOne(new EntityWrapper<DisciplineInfo>().eq("discipline_no",disciplineInfo.getDisciplineNo()))==null){
            try {
                boolean b = lessonInfoService.insert(disciplineInfo);
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
     * 更新课程信息
     */
    @PutMapping("updateLesson/{disciplineId}")
    public @ResponseBody String updateLesson(@PathVariable String disciplineId,DisciplineInfo disciplineInfo){
        try {
            boolean b = lessonInfoService.updateById(disciplineInfo);
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
     * 删除课程信息
     */
    @DeleteMapping("info/deleteDiscipline/{disciplineId}")
    public @ResponseBody String deleteDiscipline(@PathVariable String disciplineId) {
        try {
            boolean b = lessonInfoService.deleteById(Integer.parseInt(disciplineId));
            if (b == false) {
                return "false";
            }
            return "true";
        } catch (Exception e) {
            return "false";
        }
    }

}
