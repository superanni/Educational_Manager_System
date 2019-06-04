package com.twoGroup.educational.service.impl;

import com.twoGroup.educational.entities.ClassInfo;
import com.twoGroup.educational.entities.ClassTransactionInfo;
import com.twoGroup.educational.mapper.ClassInfoMapper;
import com.twoGroup.educational.mapper.ClassTransactionInfoMapper;
import com.twoGroup.educational.service.ClassTransactionInfoService;
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
public class ClassTransactionInfoServiceImpl extends ServiceImpl<ClassTransactionInfoMapper, ClassTransactionInfo> implements ClassTransactionInfoService {

    @Autowired
    ClassTransactionInfoMapper classTransactionInfoMapper;
    @Autowired
    ClassInfoMapper classInfoMapper;

    //连接查询所有班级事务
    @Override
    public List<ClassTransactionInfo> selectList() {
        return classTransactionInfoMapper.selectLinkList();
    }

    //连接模糊查询所有班级事务
    @Override
    public List<ClassTransactionInfo> selectListLike(String classTransactionTitle) {
        return classTransactionInfoMapper.selectListLike(classTransactionTitle);
    }

    //查询所有班级信息
    @Override
    public List<ClassInfo> selectClassInfoList() {
        return classInfoMapper.selectList(null);
    }

    //连接查询班级事务
    @Override
    public ClassTransactionInfo selectLinkById(String classTransactionId) {
        return classTransactionInfoMapper.selectLinkById(classTransactionId);
    }
}
