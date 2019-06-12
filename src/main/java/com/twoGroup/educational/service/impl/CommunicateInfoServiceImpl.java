package com.twoGroup.educational.service.impl;

import com.twoGroup.educational.entities.CommunicateInfo;
import com.twoGroup.educational.entities.StudentInfo;
import com.twoGroup.educational.mapper.CommunicateInfoMapper;
import com.twoGroup.educational.service.CommunicateInfoService;
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
public class CommunicateInfoServiceImpl extends ServiceImpl<CommunicateInfoMapper, CommunicateInfo> implements CommunicateInfoService {

    @Autowired
    CommunicateInfoMapper mapper;

    @Override
    public List<CommunicateInfo> listCommunicateLike(StudentInfo studentInfo) {
        return mapper.listCommunicateLike(studentInfo);
    }
}
