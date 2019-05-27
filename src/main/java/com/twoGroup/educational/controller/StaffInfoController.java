package com.twoGroup.educational.controller;


import com.github.pagehelper.PageHelper;
import com.twoGroup.educational.entities.StaffInfo;
import com.twoGroup.educational.service.StaffInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@RestController
@RequestMapping("/staffInfo")
public class StaffInfoController {

    @Autowired
    StaffInfoService service;

    @GetMapping("/test")
    public String test(){
        List<StaffInfo> lis = service.selectListVo();
        for (StaffInfo li : lis) {
            System.out.println("StaffInfo = " + li);
        }
        return lis.toString();
    }
    @GetMapping("/test2")
    public String test2(){
        PageHelper.startPage(0,1);
        List<StaffInfo> lis = service.selectList(null);
        for (StaffInfo li : lis) {
            System.out.println("StaffInfo = " + li);
        }

        return lis.toString();
    }
}

