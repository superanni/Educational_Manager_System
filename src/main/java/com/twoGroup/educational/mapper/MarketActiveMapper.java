package com.twoGroup.educational.mapper;

import com.twoGroup.educational.entities.MarketActive;
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
public interface MarketActiveMapper extends BaseMapper<MarketActive> {
	public List<MarketActive> selectlistMarketActive();
}
