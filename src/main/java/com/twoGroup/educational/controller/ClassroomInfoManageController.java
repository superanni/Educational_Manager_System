package com.twoGroup.educational.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.github.pagehelper.PageHelper;
import com.twoGroup.educational.commonUtils.DataTransUtil;
import com.twoGroup.educational.entities.ClassroomInfo;
import com.twoGroup.educational.entities.DisciplineInfo;
import com.twoGroup.educational.service.ClassroomInfoService;
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
 * 教务管理模块->教室管理
 */
@RestController
@RequestMapping("classroomInfo")
public class ClassroomInfoManageController {

    private Logger logger = LoggerFactory.getLogger(ClassroomInfoManageController.class);

    @Autowired
    /*课程信息业务接口*/
    ClassroomInfoService classroomInfoService;

    //跳转地址前缀
    private String locationURI = "manager/developmentManage/saveOrUpdate/";

    //所有教室信息
    private List<ClassroomInfo> classroomInfos;

    //教室信息
    private ClassroomInfo classroomInfo;


    /**
     * 分页查询所有教室信息
     */
    @GetMapping("info/listClassroomManage/{currentPage}")
    public @ResponseBody String listClassroomManage(Map map, @PathVariable int currentPage) {
        //每页显示五行数据
        PageHelper.startPage(currentPage, 5);
        //获取数据
        classroomInfos = classroomInfoService.selectList(null);
        if (classroomInfos != null) {
            //数据绑定
            return DataTransUtil.dataUtil(map, classroomInfos);
        }
        return "false";
    }

    /**
     * 条件查询
     */
    @PostMapping("info/listClassroomManageLike")
    public @ResponseBody String listClassroomManageLike(Map<String,Object> map,int currentPage , ClassroomInfo classroomInfo){
        //判断有无条件
        Wrapper<ClassroomInfo> classroomInfoWrapper = null;
        if (!"".equals(classroomInfo.getClassroomName())) {
            classroomInfoWrapper = new EntityWrapper<ClassroomInfo>().like("classroom_name", classroomInfo.getClassroomName().trim());
        }
        //每页显示五行数据
        PageHelper.startPage(currentPage, 5);
        //获取数据
        classroomInfos = classroomInfoService.selectList(classroomInfoWrapper); //也可以用匿名类
        if (classroomInfos != null) {
            //数据绑定
            return DataTransUtil.dataUtil(map, classroomInfos);
        }
        return "false";
    }

    /**
     * 更新、添加教室信息的条件查询
     */
    @GetMapping("saveOrUpdate/condition/{classroomId}")
    public @ResponseBody String condition(@PathVariable String classroomId,Map map) {
        //修改操作、有classroomId参数
        try {
            if (!"".equals(classroomId)){
                classroomInfo=classroomInfoService.selectById(classroomId);
                return DataTransUtil.oneObjDataUtil(map,"classroomInfo",classroomInfo);
            }else{
            }
        } catch (Exception e) {
            return "false";
        }
        return "false";
    }

    /**
     * 添加教室信息
     */
    @PostMapping("saveClassroom")
    public @ResponseBody String saveClassroom(ClassroomInfo classroomInfo){
        if (classroomInfoService.selectOne(new EntityWrapper<ClassroomInfo>().eq("classroom_name",classroomInfo.getClassroomName()))==null){
            try {
                boolean b = classroomInfoService.insert(classroomInfo);
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
     * 更新教室信息
     */
    @PutMapping("updateClassroom/{classroomId}")
    public @ResponseBody String saveLesson(@PathVariable String classroomId,ClassroomInfo classroomInfo){
        try {
            boolean b = classroomInfoService.updateById(classroomInfo);
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
     * 删除教室信息
     */
    @DeleteMapping("info/deleteClassroom/{classroomId}")
    public @ResponseBody String deleteDiscipline(@PathVariable String classroomId) {
        try {
            boolean b = classroomInfoService.deleteById(Integer.parseInt(classroomId));
            if (b == false) {
                return "false";
            }
            return "true";
        } catch (Exception e) {
            return "false";
        }
    }

}

