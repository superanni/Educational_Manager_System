package com.twoGroup.educational.service;

import com.twoGroup.educational.entities.*;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
public interface EvaluationInfoService extends IService<EvaluationInfo> {

    //连接查询所有学生月度评价信息
    List<EvaluationInfo> selectLinkList();

    //查询所有学生信息
    List<StudentInfo> selectStudentList();

    //查询所有课程信息
    List<DisciplineInfo> selectLessonList();

    //查询所有教师信息
    List<StaffInfo> selectTeacherList();

    //查询所有班级信息
    List<ClassInfo> selectClassList();
}
