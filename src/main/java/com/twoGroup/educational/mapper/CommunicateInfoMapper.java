package com.twoGroup.educational.mapper;

import com.twoGroup.educational.entities.CommunicateInfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.twoGroup.educational.entities.StudentInfo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
public interface CommunicateInfoMapper extends BaseMapper<CommunicateInfo> {

    List<CommunicateInfo> listCommunicateLike(StudentInfo studentInfo);
}
