package com.twoGroup.educational.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.github.pagehelper.PageHelper;
import com.twoGroup.educational.commonUtils.DataTransUtil;
import com.twoGroup.educational.commonUtils.RedisUtils;
import com.twoGroup.educational.entities.*;
import com.twoGroup.educational.service.ClassInfoService;
import com.twoGroup.educational.service.DisciplineInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

/**
 * @Author: 黄彬朕
 * @Date: 19.05.27
 * 教务管理模块->班级管理
 */
@RestController
@RequestMapping("classInfo")
public class ClassInfoController {
    private Logger logger = LoggerFactory.getLogger(ClassInfoController.class);

    @Autowired
    /*班级信息业务接口*/
    ClassInfoService classInfoService;
    //redis
    @Autowired
    RedisUtils redisUtils;

    //所有班级信息
    private List<ClassInfo> classInfos;

    //班级信息
    private ClassInfo classInfo;


    /**
     * 分页查询所有班级信息
     */
    @GetMapping("info/listClassManage/{currentPage}")
    public @ResponseBody String listClassManage(Map map, @PathVariable int currentPage) {

        try {
            classInfos = (List<ClassInfo>) redisUtils.get("classInfos");
            //在redis缓存中查询是否有数据
            if (null==classInfos){
                //线程锁定只让第一位用户在数据库中访问数据
                synchronized (this){
                    classInfos = (List<ClassInfo>) redisUtils.get("classInfos");
                    if (null==classInfos){
                        classInfos = classInfoService.selectList();
                        redisUtils.set("classInfos",classInfos);
                    }
                }
            }
            //封装的总页数、总记录数、当前页数
            DataTransUtil.redisDataUtil(map,classInfos,currentPage,5);
            //如果redis有缓存数据则分页查询出数据
            classInfos= (List<ClassInfo>) redisUtils.selectByPage("classInfos",currentPage,5);
            if (classInfos != null) {
                //数据绑定
                map.put("list", classInfos);
                return JSON.toJSONString(map);
            }
        }catch (Exception e){
            PageHelper.startPage(currentPage,5);
            classInfos = classInfoService.selectList(null);
            if (classInfos != null) {
                //数据绑定
                return DataTransUtil.dataUtil(map,classInfos);
            }
            return "false";
        }
        return "false";
    }

    /**
     * 条件查询
     */
    @PostMapping("info/listClassManageLike")
    public @ResponseBody String listClassManageLike(Map<String,Object> map,int currentPage , ClassInfo classInfo){
        //判断有无条件
        if (!"".equals(classInfo.getClassName())) {
            //每页显示五行数据
            PageHelper.startPage(currentPage, 5);
            classInfos=classInfoService.selectListLike(classInfo.getClassName());
            if (classInfos != null) {
                //数据绑定
                return DataTransUtil.dataUtil(map, classInfos);
            }
        }else {
            return listClassManage(map,currentPage);
        }

        return "false";
    }

    /**
     * 更新班级信息的条件查询
     */
    @GetMapping("saveOrUpdate/condition/{classId}")
    public @ResponseBody String condition(@PathVariable String classId,Map map) {
        //修改操作、有disciplineId参数
        try {
            //查询所有教师信息
            List<StaffInfo> teachers=classInfoService.selectTeacherList();

            //查询所有课程表信息
            List<SyllabusInfo> lessonTables=classInfoService.selectLessonTableList();

            //查询所有教室信息
            List<ClassroomInfo> classrooms=classInfoService.selectClassroomList();

            map.put("teachers",teachers);
            map.put("lessonTables",lessonTables);
            map.put("classrooms",classrooms);

            if (!"null".equals(classId))
                classInfo=classInfoService.selectLinkById(classId);
            return DataTransUtil.oneObjDataUtil(map,"classInfo",classInfo);
        } catch (Exception e) {
            return "false";
        }
    }

    /**
     * 添加班级信息查询条件
     */
    @GetMapping("saveOrUpdate/saveCondition")
    public @ResponseBody String saveCondition(Map map) {
        //修改操作、有disciplineId参数
        try {
            //查询所有教师信息
            List<StaffInfo> teachers=classInfoService.selectTeacherList();

            //查询所有课程表信息
            List<SyllabusInfo> lessonTables=classInfoService.selectLessonTableList();

            //查询所有教室信息
            List<ClassroomInfo> classrooms=classInfoService.selectClassroomList();

            map.put("teachers",teachers);
            map.put("lessonTables",lessonTables);
            map.put("classrooms",classrooms);
            map.put("status",0);

            return JSON.toJSONString(map);
        } catch (Exception e) {
            return "false";
        }
    }


    /**
     * 添加班级信息
     */
    @PostMapping("saveClass")
    public @ResponseBody String saveClass(ClassInfo classInfo){
        if (classInfoService.selectOne(new EntityWrapper<ClassInfo>().eq("class_name",classInfo.getClassName()))==null){
            try {
                boolean b = classInfoService.insert(classInfo);
                if (b==true){
                    redisUtils.delete("classInfos");
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
     * 更新班级信息
     */
    @PutMapping("updateClass/{classId}")
    public @ResponseBody String updateClass(@PathVariable String classId,ClassInfo classInfo){
        try {
            boolean b = classInfoService.updateById(classInfo);
            if (b==true){
                redisUtils.delete("classInfos");
                return "true";
            }else {
                return "false";
            }
        } catch (Exception e) {
            return "false";
        }
    }

    /**
     * 删除班级信息
     */
    @DeleteMapping("info/deleteClassInfo/{classId}")
    public @ResponseBody String deleteClass(@PathVariable String classId) {
        try {
            boolean b = classInfoService.deleteById(Integer.parseInt(classId));
            if (b==true){
                redisUtils.delete("classInfos");
                return "true";
            }else {
                return "false";
            }
        } catch (Exception e) {
            return "false";
        }
    }

}


