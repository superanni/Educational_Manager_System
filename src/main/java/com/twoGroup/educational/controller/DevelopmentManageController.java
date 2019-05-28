package com.twoGroup.educational.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
 * @Date:   19.05.27
 */
@Controller
@RequestMapping("developmentManage")
public class DevelopmentManageController {
    private Logger logger=LoggerFactory.getLogger(DevelopmentManageController.class);

    @Autowired
    /*课程信息业务接口*/
    DisciplineInfoService lessonInfoService;

    //跳转地址前缀
    private String locationURI="manager/developmentManage";
    //分页起始页
    private Integer currentPage=0;



    //所有课程信息
    private List<DisciplineInfo> lessonInfos;
    //课程信息
    private DisciplineInfo lessonInfo;

    //作为测试
    /*教务管理下跳转的页面放行*/
    @GetMapping("{managePage}")
    public String test(@PathVariable String managePage, Map map){
        return locationURI+"/"+managePage;
    }

    /**
     * 课程管理
     * 显示课程信息
     * */
    @GetMapping("info/lessonManage/{currentPage}")
    public @ResponseBody String listLessonManage(Map map,@PathVariable int currentPage){
        try {
            //每页显示五行数据
            PageHelper.startPage(currentPage,5);
            //获取数据
            lessonInfos = lessonInfoService.selectList(null);
            if (lessonInfos != null) {
                PageInfo pageInfo=new PageInfo(lessonInfos);
                map.put("status",0);
                map.put("list", lessonInfos);
                map.put("currentPage",currentPage);
                map.put("total",pageInfo.getTotal());
                map.put("totalPage",pageInfo.getPages());
            }
        } catch (Exception e) {
            logger.info("han---获取课程信息失败");
            map.put("list",null);
        }
        return JSON.toJSONString(map);
    }

    @GetMapping("saveOrUpdate/{page}")
    public String testModifyData(@PathVariable String page){
        return locationURI+"/saveOrUpdate/"+page;
    }


    /*判断执行方法*/
    public void intoFunction(String managePage,Map map){
        switch (managePage){
            /*课程管理*/
            case "lessonManage":
                /*查询所有课程信息*/


                break;
            /*课程表管理*/
            case "lessonTable":

                break;
            /*教师管理*/
            case "teacherManage":

                break;
            /*教室管理*/
            case "classroomManage":

                break;
            /*班级管理*/
            case "gradeclassManage":

                break;
            /*事务管理*/
            case "gradeclassTransaction":

                break;
            /*听课记录*/
            case "listenClassWriteDown":

                break;
            /*学生评教(月度)*/
            case "studentEvaluateByMonth":

                break;
            /*学生评教(学期)*/
            case "studentEvaluateByTerm":

                break;
        }
    }
}
