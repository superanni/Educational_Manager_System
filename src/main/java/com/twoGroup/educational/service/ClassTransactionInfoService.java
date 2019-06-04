package com.twoGroup.educational.service;

import com.twoGroup.educational.entities.ClassInfo;
import com.twoGroup.educational.entities.ClassTransactionInfo;
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
public interface ClassTransactionInfoService extends IService<ClassTransactionInfo> {

    //连接查询所有班级事务
    List<ClassTransactionInfo> selectList();

    //连接模糊查询所有班级事务
    List<ClassTransactionInfo> selectListLike(String classTransactionTitle);

    //查询所有班级信息
    List<ClassInfo> selectClassInfoList();

    //连接查询班级事务
    ClassTransactionInfo selectLinkById(String classTransactionId);
}
