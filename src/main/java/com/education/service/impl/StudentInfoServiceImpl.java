package com.education.service.impl;

import com.education.entity.StudentInfo;
import com.education.mapper.StudentInfoMapper;
import com.education.service.StudentInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-24
 */
@Service
public class StudentInfoServiceImpl extends ServiceImpl<StudentInfoMapper, StudentInfo> implements StudentInfoService {

}
