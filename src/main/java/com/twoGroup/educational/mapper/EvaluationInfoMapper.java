package com.twoGroup.educational.mapper;

import com.twoGroup.educational.entities.ClassInfo;
import com.twoGroup.educational.entities.EvaluationInfo;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author GroupTwo
 * @since 2019-05-26
 */
public interface EvaluationInfoMapper extends BaseMapper<EvaluationInfo> {

    //连接查询所有学生月度评价信息
    List<EvaluationInfo> selectLinkList();

}
