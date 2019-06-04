package com.twoGroup.educational.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.github.pagehelper.PageHelper;
import com.sun.media.sound.SoftTuning;
import com.twoGroup.educational.commonUtils.DataTransUtil;
import com.twoGroup.educational.entities.CommunicateInfo;
import com.twoGroup.educational.entities.DisciplineInfo;
import com.twoGroup.educational.entities.StudentInfo;
import com.twoGroup.educational.service.CommunicateInfoService;
import com.twoGroup.educational.service.StaffInfoService;
import com.twoGroup.educational.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sound.sampled.Line;
import javax.xml.crypto.Data;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@RestController
@RequestMapping("/communicateInfo")
public class CommunicateInfoController {

    @Autowired
    CommunicateInfoService service;

    @Autowired
    StaffInfoService staffInfoService;

    @Autowired
    StudentInfoService studentInfoService;

    /**
     * 查询评价信息.
     *
     * @param currentPage
     * @param map
     * @return
     */
    @GetMapping("selectAllCommunicate/{currentPage}")
    public String selectAllCommunicate(@PathVariable("currentPage") Integer currentPage, Map map) {
        //条件查询
        PageHelper.startPage(currentPage, 5);
        List<CommunicateInfo> list = service.listCommunicateLike(null);
        return DataTransUtil.dataUtil(map, list);
    }

    /**
     * 条件查询评价信息
     * @param map
     * @param currentPage
     * @param studentInfo
     * @return
     */
    @PostMapping("listCommunicateLike")
    public String listCommunicateLike(Map map,Integer currentPage, StudentInfo studentInfo){
        List<CommunicateInfo> communicateInfos = service.listCommunicateLike(studentInfo);
        return DataTransUtil.dataUtil(map,communicateInfos);
    }

    /**
     * 查询修改条件
     * @param map
     * @param commuicateId
     * @return
     */
    @GetMapping("saveOrUpdate/condition/{communicateId}")
    public String condition(Map map,@PathVariable("communicateId") String commuicateId) {
        CommunicateInfo info = service.selectById(Integer.parseInt(commuicateId));
        info.setStudentInfo(studentInfoService.selectById(info.getStudentId()));
        return DataTransUtil.oneObjDataUtil(map,"communicateInfo",info);
    }

    /**
     * 查询添加条件
     */
    @GetMapping("saveOrUpdate/condition")
    public String condition(Map map) {
        List<StudentInfo> studentInfos = studentInfoService.selectList(null);
        return DataTransUtil.dataUtil(map,studentInfos);
    }

    /**
     * 添加评价
     * @param communicateInfo
     * @return
     */
    @PostMapping("saveCommunicate")
    public String saveCommunicate(CommunicateInfo communicateInfo){
        communicateInfo.setStaffId(83);
        boolean insert = service.insert(communicateInfo);
        if (!insert) {
            return "false";
        }
        return "true";
    }

    /**
     * 修改评价
     * @param communicateInfo
     * @return
     */
    @PutMapping("updateCommunicate")
    public String updateCommunicate(CommunicateInfo communicateInfo){
        boolean b = service.updateById(communicateInfo);
        if (!b){
            return "false";
        }
        return "true";
    }

    /**
     * 删除评价
     * @param id
     * @return
     */
    @DeleteMapping("deleteCommunicate/{id}")
    public String deleteCommunicate(@PathVariable("id") String id){
        boolean b = service.deleteById(Integer.parseInt(id));
        if(!b){
            return "false";
        }
        return "true";
    }
}
