package com.twoGroup.educational.mapper;

import com.twoGroup.educational.entities.ClassTransactionInfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
public interface ClassTransactionInfoMapper extends BaseMapper<ClassTransactionInfo> {

    //连接查询所有班级事务
    List<ClassTransactionInfo> selectLinkList();

    //连接模糊查询所有班级事务
    List<ClassTransactionInfo> selectListLike(@Param("classTransactionTitle") String classTransactionTitle);

    //连接查询班级事务
    ClassTransactionInfo selectLinkById(@Param("classTransactionId") String classTransactionId);
}
