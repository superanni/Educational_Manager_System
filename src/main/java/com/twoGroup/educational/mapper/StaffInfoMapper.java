package com.twoGroup.educational.mapper;

import com.twoGroup.educational.entities.StaffInfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
public interface StaffInfoMapper extends BaseMapper<StaffInfo> {
    List<StaffInfo> selectListVo();  //实现条件查询
}
