package com.twoGroup.educational.service.impl;

import com.twoGroup.educational.entities.ClassInfo;
import com.twoGroup.educational.entities.ClassroomInfo;
import com.twoGroup.educational.entities.StaffInfo;
import com.twoGroup.educational.entities.SyllabusInfo;
import com.twoGroup.educational.mapper.ClassInfoMapper;
import com.twoGroup.educational.mapper.ClassroomInfoMapper;
import com.twoGroup.educational.mapper.StaffInfoMapper;
import com.twoGroup.educational.mapper.SyllabusInfoMapper;
import com.twoGroup.educational.service.ClassInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.twoGroup.educational.service.StaffInfoService;
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
public class ClassInfoServiceImpl extends ServiceImpl<ClassInfoMapper, ClassInfo> implements ClassInfoService {

    @Autowired
    ClassInfoMapper classInfoMapper;
    @Autowired
    StaffInfoMapper staffInfoMapper;
    @Autowired
    SyllabusInfoMapper syllabusInfoMapper;
    @Autowired
    ClassroomInfoMapper classroomInfoMapper;


    //连接查询所有班级信息
    @Override
    public List<ClassInfo> selectList() {
        return classInfoMapper.selectLinkList();
    }

    //根据班级名称查询班级信息
    @Override
    public List<ClassInfo> selectListLike(String className) {
        return classInfoMapper.selectListLike(className);
    }

    //根据id连接查询班级信息
    @Override
    public ClassInfo selectLinkById(String classId) {
        return classInfoMapper.selectLinkById(classId);
    }

    //查询所有教师信息
    @Override
    public List<StaffInfo> selectTeacherList() {
        return staffInfoMapper.selectList(null);
    }

    //查询所有课程表信息
    @Override
    public List<SyllabusInfo> selectLessonTableList() {
        return syllabusInfoMapper.selectList(null);
    }

    //查询所有教室信息
    @Override
    public List<ClassroomInfo> selectClassroomList() {
        return classroomInfoMapper.selectList(null);
    }
}
