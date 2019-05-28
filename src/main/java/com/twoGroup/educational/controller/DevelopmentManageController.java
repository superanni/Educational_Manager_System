package com.twoGroup.educational.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.twoGroup.educational.dataTransUtil.DataTransUtil;
import com.twoGroup.educational.entities.DisciplineInfo;
import com.twoGroup.educational.service.DisciplineInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Condition;

/**
 * 课程管理
 *
 * @Author: 黄彬朕
 * @Date: 19.05.27
 */
@Controller
@RequestMapping("developmentManage")
public class DevelopmentManageController {
    private Logger logger = LoggerFactory.getLogger(DevelopmentManageController.class);

    @Autowired
    /*课程信息业务接口*/
            DisciplineInfoService lessonInfoService;

    //跳转地址前缀
    private String locationURI = "manager/developmentManage";

    //所有课程信息
    private List<DisciplineInfo> lessonInfos;

    //作为测试
    /*教务管理下跳转的页面放行*/
    @GetMapping("{managePage}")
    public String test(@PathVariable String managePage) {
        return locationURI + "/" + managePage;
    }

    /**
     * 分页查询所有课程信息,
     */
    @GetMapping("info/listLessonManage/{currentPage}")
    public @ResponseBody String listLessonManage(Map map, @PathVariable int currentPage, DisciplineInfo disciplineInfo) {
        //每页显示五行数据
        PageHelper.startPage(currentPage, 5);
        //获取数据
        lessonInfos = lessonInfoService.selectList(null);
        if (lessonInfos != null) {
            //数据绑定
            return DataTransUtil.dataUtil(map, lessonInfos);
        }
        return "error";
    }


    /**
     * 条件查询
     * @param map
     * @param currentPage
     * @param disciplineInfo
     * @return
     */
    @PostMapping("info/listLessonManageLike")
    public @ResponseBody String listLessonManageLike(Map<String,Object> map,int currentPage , DisciplineInfo disciplineInfo){
        Wrapper<DisciplineInfo> disciplineName = null;
        //判断有无条件
        if (disciplineInfo.getDisciplineName() != null) {
            if (!"".equals(disciplineInfo.getDisciplineName().trim())) {
                disciplineName = new EntityWrapper<DisciplineInfo>().like("discipline_name", disciplineInfo.getDisciplineName().trim());
            }
        }
        //每页显示五行数据
        PageHelper.startPage(currentPage, 5);
        //获取数据
        lessonInfos = lessonInfoService.selectList(disciplineName); //也可以用匿名类
        if (lessonInfos != null) {
            //数据绑定
            return DataTransUtil.dataUtil(map, lessonInfos);
        }
        return "error";
    }

    /**
     * 删除课程信息
     *
     * @param discipline_id
     * @return
     */
    @DeleteMapping("info/deleteDiscipline/{discipline_id}")
    public @ResponseBody
    String deleteDiscipline(@PathVariable String discipline_id) {
        boolean b = lessonInfoService.deleteById(Integer.parseInt(discipline_id));
        if (b == false) {
            return "fail";
        }
        return "true";
    }

    @GetMapping("saveOrUpdate/{page}")
    public String testModifyData(@PathVariable String page) {
        return locationURI + "/saveOrUpdate/" + page;
    }


    /*判断执行方法*/
    public void intoFunction(String managePage, Map map) {
        switch (managePage) {
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
