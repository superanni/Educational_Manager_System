package com.twoGroup.educational.mapper;

import com.twoGroup.educational.entities.MarketActive;
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
public interface MarketActiveMapper extends BaseMapper<MarketActive> {
	 List<MarketActive> selectList();
	//根据文件标题查询文件信息
	List<MarketActive> selectListLikeName(
			@Param("activeName") String activeName,@Param("activeState")int activeState);

}
