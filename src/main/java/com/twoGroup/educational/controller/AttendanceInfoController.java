package com.twoGroup.educational.controller;


import com.github.pagehelper.PageHelper;
import com.twoGroup.educational.commonUtils.DataTransUtil;
import com.twoGroup.educational.entities.AttendanceInfo;
import com.twoGroup.educational.entities.StudentInfo;
import com.twoGroup.educational.service.AttendanceInfoService;
import com.twoGroup.educational.service.StudentInfoService;
import org.apache.ibatis.annotations.Param;
import org.codehaus.groovy.util.ListHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器 ：学生考勤
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@RestController
@RequestMapping("/attendanceInfo")
public class AttendanceInfoController {
    private Map<String , Object> map = new ListHashMap<>();

    @Autowired
    AttendanceInfoService service;

    @Autowired
    StudentInfoService studentInfoService;

    /**
     * 查询所有考勤信息
     * @param currentPage
     * @return
     */
    @GetMapping("listAllAttendance/{currentPage}")
    public String listAllAttendance(@PathVariable("currentPage")Integer currentPage){
        PageHelper.startPage(currentPage,5);
        List<AttendanceInfo> list = service.listAttendanceLike(new AttendanceInfo(),null);
        return DataTransUtil.dataUtil(map,list);
    }

    /**
     * 条件查询所有的考勤信息
     * @param currentPage
     * @param attendanceInfo
     * @param studentName
     * @return
     */
    @PostMapping("listAttendanceLike")
    public String listAttendanceLike(Integer currentPage , AttendanceInfo attendanceInfo,String studentName){
        PageHelper.startPage(currentPage,5);
        List<AttendanceInfo> list = service.listAttendanceLike(attendanceInfo,studentName);
        return DataTransUtil.dataUtil(map,list);
    }

    /**
     *  查询所有学生信息
     * @return
     */
    @GetMapping("saveOrUpdate/condition")
    public String toSaveOrUpdate(){
        List<StudentInfo> list = studentInfoService.selectList(null);
        return DataTransUtil.dataUtil(map,list);
    }

    /**
     *  查询单个考勤信息
     * @return
     */
    @GetMapping("saveOrUpdate/condition/{attendanceId}")
    public String toSaveOrUpdate(@PathVariable("attendanceId")String attendanceId){
        AttendanceInfo attendanceInfo = service.selectById(Integer.parseInt(attendanceId));
        attendanceInfo.setStudentInfo(studentInfoService.selectById(attendanceInfo.getStudentId()));
        return DataTransUtil.oneObjDataUtil(map,"attendanceInfo",attendanceInfo);
    }

    /**
     * 添加考勤信息
     * @param attendanceInfo
     * @return
     */
    @PostMapping("saveAttendance")
    public String saveAttendance(AttendanceInfo attendanceInfo){
        attendanceInfo.setStaffId(83);
        boolean insert = service.insert(attendanceInfo);
        if (!insert) {
            return "false";
        }
        return "true";
    }

    /**
     * 修改考勤信息
     * @param attendanceInfo
     * @return
     */
    @PutMapping("updateAttendance")
    public String updateAttendance(AttendanceInfo attendanceInfo){
        boolean insert = service.updateById(attendanceInfo);
        if (!insert) {
            return "false";
        }
        return "true";
    }

    /**
     * 删除考情信息
     * @param id
     * @return
     */
    @DeleteMapping("deleteAttendance/{id}")
    public String deleteAttendance(@PathVariable("id") String id){
        boolean b = service.deleteById(Integer.parseInt(id));
        if (!b) {
            return "false";
        }
        return "true";
    }
}

