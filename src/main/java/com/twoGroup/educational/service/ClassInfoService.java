package com.twoGroup.educational.service;

import com.twoGroup.educational.entities.ClassInfo;
import com.baomidou.mybatisplus.service.IService;
import com.twoGroup.educational.entities.ClassroomInfo;
import com.twoGroup.educational.entities.StaffInfo;
import com.twoGroup.educational.entities.SyllabusInfo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 * 班级管理、多表操作
 * @author 黄彬朕
 * @since 2019-05-26
 */
public interface ClassInfoService extends IService<ClassInfo> {

    //连接查询所有班级信息
    List<ClassInfo> selectList();

    //根据班级名称查询班级信息
    List<ClassInfo> selectListLike(String className);

    //根据id连接查询班级信息
    ClassInfo selectLinkById(String classId);

    //查询所有教师信息
    List<StaffInfo> selectTeacherList();

    //查询所有课程表信息
    List<SyllabusInfo> selectLessonTableList();

    //查询所有教室信息
    List<ClassroomInfo> selectClassroomList();
}
