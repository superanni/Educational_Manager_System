package com.twoGroup.educational.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.github.pagehelper.PageHelper;
import com.twoGroup.educational.commonUtils.DataTransUtil;
import com.twoGroup.educational.entities.DisciplineInfo;
import com.twoGroup.educational.entities.StaffInfo;
import com.twoGroup.educational.service.DisciplineInfoService;
import com.twoGroup.educational.service.StaffInfoService;
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
 * 教务管理模块->教师管理
 */
@RestController
@RequestMapping("staffInfo")
public class StaffInfoManageController {
    private Logger logger = LoggerFactory.getLogger(StaffInfoManageController.class);

    @Autowired
    /*教师信息业务接口*/
    StaffInfoService staffInfoService;

    //所有教师信息
    private List<StaffInfo> staffInfos;

    //教师信息
    private StaffInfo staffInfo;


    /**
     * 分页查询所有教师信息
     */
    @GetMapping("info/listTeacherManage/{currentPage}")
    public @ResponseBody String listTeacherManage(Map map, @PathVariable int currentPage) {
        //每页显示五行数据
        PageHelper.startPage(currentPage, 5);
        //获取数据
        staffInfos = staffInfoService.selectList(null);
        if (staffInfos != null) {
            //数据绑定
            return DataTransUtil.dataUtil(map, staffInfos);
        }
        return "false";
    }

    /**
     * 条件查询
     */
    @PostMapping("info/listTeacherManageLike")
    public @ResponseBody String listTeacherManageLike(Map<String,Object> map,int currentPage ,String selectCondition,String conditionValue){
        //判断有无条件
        Wrapper<StaffInfo> staffInfoWrapper = null;
        if (!"".equals(conditionValue)) {
            staffInfoWrapper = new EntityWrapper<StaffInfo>().like(selectCondition, conditionValue);
        }
        //每页显示五行数据
        PageHelper.startPage(currentPage, 5);
        //获取数据
        staffInfos = staffInfoService.selectList(staffInfoWrapper); //也可以用匿名类
        if (staffInfos != null) {
            //数据绑定
            return DataTransUtil.dataUtil(map, staffInfos);
        }
        return "false";
    }

    /**
     * 更新、添加教师信息的条件查询
     */
    @GetMapping("saveOrUpdate/condition/{staffId}")
    public @ResponseBody String condition(@PathVariable String staffId,Map map) {
        //修改操作、有disciplineId参数
        try {
            if (!"".equals(staffId)){
                staffInfo=staffInfoService.selectById(staffId);
                return DataTransUtil.oneObjDataUtil(map,"staffInfo",staffInfo);
            }else{
            }
        } catch (Exception e) {
            return "false";
        }
        return "false";
    }

    /**
     * 添加教师信息
     */
    @PostMapping("saveTeacher")
    public @ResponseBody String saveTeacher(StaffInfo staffInfo){
        if (staffInfoService.selectOne(new EntityWrapper<StaffInfo>().eq("user_number",staffInfo.getUserNumber()))==null){
            try {
                boolean b = staffInfoService.insert(staffInfo);
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
     * 更新教师信息
     */
    @PutMapping("updateTeacher/{staffId}")
    public @ResponseBody String updateTeacher(@PathVariable String staffId,StaffInfo staffInfo){
        try {
            boolean b = staffInfoService.updateById(staffInfo);
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
     * 删除教师信息
     */
    @DeleteMapping("info/deleteTeacher/{staffId}")
    public @ResponseBody String deleteTeacher(@PathVariable String staffId) {
        try {
            boolean b = staffInfoService.deleteById(Integer.parseInt(staffId));
            if (b == false) {
                return "false";
            }
            return "true";
        } catch (Exception e) {
            return "false";
        }
    }

}
