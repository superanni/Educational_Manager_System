package com.twoGroup.educational.mapper;

import com.twoGroup.educational.entities.ClassInfo;
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
public interface ClassInfoMapper extends BaseMapper<ClassInfo> {

    //连接查询所有班级信息
    List<ClassInfo> selectLinkList();

    //根据班级名称查询班级信息
    List<ClassInfo> selectListLike(@Param("className") String className);

    //根据id连接查询班级信息
    ClassInfo selectLinkById(@Param("classId") String classId);
}
