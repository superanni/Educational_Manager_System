package com.twoGroup.educational.controller;


import com.twoGroup.educational.commonUtils.DataTransUtil;
import com.twoGroup.educational.entities.StudentInfo;
import com.twoGroup.educational.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/studentInfo")
public class StudentInfoController {

    @Autowired
    StudentInfoService service;

    /**
     * 查询所有
     * @param map
     * @return
     */
    @GetMapping("selectList")
    public String condition(Map map) {
        List<StudentInfo> studentInfos = service.selectList(null);
        return DataTransUtil.dataUtil(map,studentInfos);
    }
}

