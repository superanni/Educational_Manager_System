package com.twoGroup.educational.controller;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.pagehelper.PageHelper;
import com.twoGroup.educational.commonUtils.DataTransUtil;
import com.twoGroup.educational.entities.*;
import com.twoGroup.educational.service.ClassInfoService;
import com.twoGroup.educational.service.ClassTransactionInfoService;
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
 * 教务管理模块->班级事务
 */
@RestController
@RequestMapping("classTransaction")
public class ClassTransactionInfoController {
    private Logger logger = LoggerFactory.getLogger(ClassInfoController.class);

    @Autowired
    /*班级事务业务接口*/
    ClassTransactionInfoService classTransactionInfoService;

    //所有班级事务信息
    private List<ClassTransactionInfo> classTransactionInfos;

    //班级事务信息
    private ClassTransactionInfo classTransactionInfo;


    /**
     * 分页查询所有班级事务
     */
    @GetMapping("info/listClassTransaction/{currentPage}")
    public @ResponseBody String listClassTransaction(Map map, @PathVariable int currentPage) {
        //每页显示五行数据
        PageHelper.startPage(currentPage, 5);
        //获取数据
        classTransactionInfos = classTransactionInfoService.selectList();
        if (classTransactionInfos != null) {
            //数据绑定
            return DataTransUtil.dataUtil(map, classTransactionInfos);
        }
        return "false";
    }

    /**
     * 条件查询
     */
    @PostMapping("info/listClassTransactionLike")
    public @ResponseBody String listClassTransactionLike(Map<String,Object> map,int currentPage , ClassTransactionInfo classTransactionInfo){
        //每页显示五行数据
        PageHelper.startPage(currentPage, 5);
        //判断有无条件
        if (!"".equals(classTransactionInfo.getClassTransactionTitle())) {
            classTransactionInfos=classTransactionInfoService.selectListLike(classTransactionInfo.getClassTransactionTitle());
        }else {
            classTransactionInfos=classTransactionInfoService.selectList();
        }
        if (classTransactionInfos != null) {
            //数据绑定
            return DataTransUtil.dataUtil(map, classTransactionInfos);
        }
        return "false";
    }

    /**
     * 更新班级事务的条件查询
     */
    @GetMapping("saveOrUpdate/condition/{classTransactionId}")
    public @ResponseBody String condition(@PathVariable String classTransactionId,Map map) {
        //修改操作、有classTransactionId参数
        try {
            //查询所有班级信息
            List<ClassInfo> classInfos=classTransactionInfoService.selectClassInfoList();

            map.put("classInfos",classInfos);

            if (!"null".equals(classTransactionId))
                classTransactionInfo=classTransactionInfoService.selectLinkById(classTransactionId);
            return DataTransUtil.oneObjDataUtil(map,"classTransactionInfo",classTransactionInfo);
        } catch (Exception e) {
            return "false";
        }
    }

    /**
     * 添加班级事务查询条件
     */
    @GetMapping("saveOrUpdate/saveCondition")
    public @ResponseBody String saveCondition(Map map) {
        //修改操作、有disciplineId参数
        try {
            //查询所有班级信息
            List<ClassInfo> classInfos=classTransactionInfoService.selectClassInfoList();

            map.put("classInfos",classInfos);
            map.put("status",0);

            return JSON.toJSONString(map);
        } catch (Exception e) {
            return "false";
        }
    }


    /**
     * 添加班级事务信息
     */
    @PostMapping("saveClassTransaction")
    public @ResponseBody String saveClassTransaction(ClassTransactionInfo classTransactionInfo){
        System.out.println("classTransactionInfo:"+classTransactionInfo);
        if (classTransactionInfoService.selectOne(new EntityWrapper<ClassTransactionInfo>().eq("class_transaction_title",classTransactionInfo.getClassTransactionTitle()).eq("class_id",classTransactionInfo.getClassId()))==null){
            try {
                boolean b = classTransactionInfoService.insert(classTransactionInfo);
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
     * 更新班级事务信息
     */
    @PutMapping("updateClassTransaction/{classTransactionId}")
    public @ResponseBody String updateClassTransaction(@PathVariable String classTransactionId,ClassTransactionInfo classTransactionInfo){
        try {
            boolean b = classTransactionInfoService.updateById(classTransactionInfo);
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
     * 删除班级事务信息
     */
    @DeleteMapping("info/deleteClassTransaction/{classTransactionId}")
    public @ResponseBody String deleteClass(@PathVariable String classTransactionId) {
        try {
            boolean b = classTransactionInfoService.deleteById(Integer.parseInt(classTransactionId));
            if (b == false) {
                return "false";
            }
            return "true";
        } catch (Exception e) {
            return "false";
        }
    }

}


