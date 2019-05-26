package com.twoGroup.educational.service.impl;

import com.twoGroup.educational.entities.StudentInfo;
import com.twoGroup.educational.mapper.StudentInfoMapper;
import com.twoGroup.educational.service.StudentInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
@Service
public class StudentInfoServiceImpl extends ServiceImpl<StudentInfoMapper, StudentInfo> implements StudentInfoService {

}
