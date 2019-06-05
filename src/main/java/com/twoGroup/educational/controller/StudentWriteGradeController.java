package com.twoGroup.educational.controller;


import com.github.pagehelper.PageHelper;
import com.twoGroup.educational.commonUtils.DataTransUtil;
import com.twoGroup.educational.entities.ClassInfo;
import com.twoGroup.educational.entities.DisciplineInfo;
import com.twoGroup.educational.entities.StudentInfo;
import com.twoGroup.educational.entities.StudentWriteGrade;
import com.twoGroup.educational.service.ClassInfoService;
import com.twoGroup.educational.service.DisciplineInfoService;
import com.twoGroup.educational.service.StudentInfoService;
import com.twoGroup.educational.service.StudentWriteGradeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  器
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@RestController
@RequestMapping("/studentWriteGradeInfo")
public class StudentWriteGradeController {


    /**
     * 查询所有
     * @param map
     * @param currentPage
     * @return
     */
    @GetMapping("selectAllStudentWriteGrade/{currentPage}")
    public String selectAllStudentWriteGrade(Map map, @PathVariable("currentPage") Integer currentPage){
        PageHelper.startPage(currentPage,5);
        List<StudentWriteGrade> studentWriteGrades = service.listStudentWriteGradeLike(new StudentWriteGrade(), new StudentInfo());
        return DataTransUtil.dataUtil(map,studentWriteGrades);
    }

    /**
     * 查询所有班级信息
     * @param map
     * @return
     */
    @GetMapping("selectAllClassInfo")
    public String selectAllClassInfo(Map map){
        List<ClassInfo> list = classInfoService.selectList(null);
        return DataTransUtil.dataUtil(map,list);
    }

    /**
     * 查询所有课程信息
     * @param map
     * @return
     */
    @GetMapping("selectAllDisciplineInfo")
    public String selectAllDisciplineInfo(Map map){
        List<DisciplineInfo> list = disciplineInfoService.selectList(null);
        return DataTransUtil.dataUtil(map,list);
    }

    /**
     * 查询所有学生信息
     * @param map
     * @return
     */
    @GetMapping("listAllStudentInfo")
    public String saveOrUpdateStudentInfo(Map map){
        List<StudentInfo> list = studentInfoService.selectList(null);
        return DataTransUtil.dataUtil(map,list);
    }

    /**
     * 期末成绩模糊查询
     * @param map
     * @param currentPage
     * @param studentWriteGrade
     * @param studentInfo
     * @return
     */
    @PostMapping("listStudentWriteGradeLike")
    public String listStudentWriteGradeLike(Map map,Integer currentPage, StudentWriteGrade studentWriteGrade , StudentInfo studentInfo){
        PageHelper.startPage(currentPage , 5);
        List<StudentWriteGrade> list = service.listStudentWriteGradeLike(studentWriteGrade, studentInfo);
        return DataTransUtil.dataUtil(map,list);
    }

    /**
     * 查询单一期末成绩
     * @param map
     * @param writeGradeId
     * @return
     */
    @GetMapping("saveOrUpdate/condition/{writeGradeId}")
    public  String condition(Map map, @PathVariable("writeGradeId") String writeGradeId){
        StudentWriteGrade grade = service.selectById(Integer.parseInt(writeGradeId));
        grade.setClassInfo(classInfoService.selectById(grade.getClassId()));
        grade.setStudentInfo(studentInfoService.selectById((grade.getStudentId())));
        grade.setClassInfo(classInfoService.selectById((grade.getClassId())));
        grade.setDisciplineInfo(disciplineInfoService.selectById((grade.getDisciplineId())));
        return DataTransUtil.oneObjDataUtil(map,"studentWriteGradeInfo",grade);
    }

    /**
     * 添加期末成绩
     * @param studentWriteGrade
     * @return
     */
    @PostMapping("saveStudentWriteGradeInfo")
    public  String saveStudentWriteGradeInfo(StudentWriteGrade studentWriteGrade){
        System.out.println("studentWriteGrade = " + studentWriteGrade);
        studentWriteGrade.setStaffId(80);
        boolean insert = service.insert(studentWriteGrade);
        if (!insert) {
            return "false";
        }
        return "true";
    }

    /***
     * 修改期末成绩
     * @param studentWriteGrade
     * @return
     */
    @PutMapping("updateStudentWriteGradeInfo")
    public  String updateStudentWriteGradeInfo(StudentWriteGrade studentWriteGrade){
        studentWriteGrade.setStaffId(80);
        boolean b = service.updateById(studentWriteGrade);
        if (!b) {
            return "false";
        }
        return "true";
    }

    /**
     * 删除期末成绩
     * @param id
     * @return
     */
    @DeleteMapping("deleteStudentWriteGradeInfo/{id}")
    public String deleteStudentWriteGradeInfo(@PathVariable("id") String id){
        boolean b = service.deleteById(Integer.parseInt(id));
        if (!b) {
            return "false";
        }
        return "true";
    }

    @Autowired
    ClassInfoService classInfoService;

    @Autowired
    DisciplineInfoService disciplineInfoService;

    @Autowired
    StudentInfoService studentInfoService;

    @Autowired
    StudentWriteGradeService service;
}

