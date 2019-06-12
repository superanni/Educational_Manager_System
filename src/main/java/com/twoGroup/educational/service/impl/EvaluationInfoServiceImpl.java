package com.twoGroup.educational.service.impl;

import com.twoGroup.educational.entities.*;
import com.twoGroup.educational.mapper.*;
import com.twoGroup.educational.service.EvaluationInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Service
public class EvaluationInfoServiceImpl extends ServiceImpl<EvaluationInfoMapper, EvaluationInfo> implements EvaluationInfoService {

    @Autowired
    EvaluationInfoMapper evaluationInfoMapper;
    @Autowired
    StudentInfoMapper studentInfoMapper;
    @Autowired
    DisciplineInfoMapper disciplineInfoMapper;
    @Autowired
    StaffInfoMapper staffInfoMapper;
    @Autowired
    ClassInfoMapper classInfoMapper;

    //连接查询所有学生月度评价信息
    @Override
    public List<EvaluationInfo> selectLinkList() {
        return evaluationInfoMapper.selectLinkList();
    }

    //查询所有学生信息
    @Override
    public List<StudentInfo> selectStudentList() {
        return studentInfoMapper.selectList(null);
    }

    //查询所有课程信息
    @Override
    public List<DisciplineInfo> selectLessonList() {
        return disciplineInfoMapper.selectList(null);
    }

    //查询所有教师信息
    @Override
    public List<StaffInfo> selectTeacherList() {
        return staffInfoMapper.selectList(null);
    }

    //查询所有班级信息
    @Override
    public List<ClassInfo> selectClassList() {
        return classInfoMapper.selectList(null);
    }
}
