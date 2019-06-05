package com.twoGroup.educational.service.impl;

import com.twoGroup.educational.entities.StudentInfo;
import com.twoGroup.educational.entities.StudentWriteGrade;
import com.twoGroup.educational.mapper.StudentWriteGradeMapper;
import com.twoGroup.educational.service.StudentWriteGradeService;
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
public class StudentWriteGradeServiceImpl extends ServiceImpl<StudentWriteGradeMapper, StudentWriteGrade> implements StudentWriteGradeService {

    @Autowired
    StudentWriteGradeMapper mapper;

    @Override
    public List<StudentWriteGrade> listStudentWriteGradeLike(StudentWriteGrade studentWriteGrade, StudentInfo studentInfo) {
        return mapper.listStudentWriteGradeLike(studentWriteGrade.getWriteGradeXuenian(),
                studentWriteGrade.getWriteGradeXueqi(),
                studentWriteGrade.getClassId(),
                studentWriteGrade.getDisciplineId(),
                studentInfo.getStudentName());

    }
}
