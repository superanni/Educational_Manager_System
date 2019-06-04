package com.twoGroup.educational.service.impl;

import com.twoGroup.educational.entities.MessafeInfo;
import com.twoGroup.educational.mapper.MessafeInfoMapper;
import com.twoGroup.educational.service.MessafeInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 黄武斌
 * @since 2019-05-26
 */
@Service
public class MessafeInfoServiceImpl extends ServiceImpl<MessafeInfoMapper, MessafeInfo> implements MessafeInfoService {
   @Autowired
   MessafeInfoMapper messafeInfoMapper;

    @Override
    public List<MessafeInfo> selectAllMessage() {

        return messafeInfoMapper.selectAllMessage();
    }

    @Override
    public List<MessafeInfo> selectLikeMessage(String telephone) {
        return  messafeInfoMapper.selectLikeMessage(telephone);
    }
}
