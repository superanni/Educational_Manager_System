package com.twoGroup.educational.mapper;

import com.twoGroup.educational.entities.MessafeInfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 黄武斌
 * @since 2019-05-26
 */
public interface MessafeInfoMapper extends BaseMapper<MessafeInfo> {
    public List<MessafeInfo> selectAllMessage();

    public  List<MessafeInfo> selectLikeMessage(@Param("telephone") String telephone);
}
