package com.twoGroup.educational.service.impl;

import com.twoGroup.educational.entities.StaffInfo;
import com.twoGroup.educational.mapper.StaffInfoMapper;
import com.twoGroup.educational.service.StaffInfoService;
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
public class StaffInfoServiceImpl extends ServiceImpl<StaffInfoMapper, StaffInfo> implements StaffInfoService {

    @Autowired
    StaffInfoMapper staffInfoMapper;

   public List<StaffInfo> selectListVo(){
       return  staffInfoMapper.selectListVo();
    }
}
