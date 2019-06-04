package com.twoGroup.educational.service.impl;

import com.twoGroup.educational.entities.MarketActive;
import com.twoGroup.educational.mapper.MarketActiveMapper;
import com.twoGroup.educational.service.MarketActiveService;
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
public class MarketActiveServiceImpl extends ServiceImpl<MarketActiveMapper, MarketActive> implements MarketActiveService {
	@Autowired
	MarketActiveMapper marketActiveMapper;

	//all markactives list
  private List<MarketActive> marketActives;

	@Override
	public List<MarketActive> selectList() {
		return  marketActiveMapper.selectList();
	}

	@Override
	public List<MarketActive> selectListLike(String activeName) {
		marketActives= marketActiveMapper.selectListLikeName(activeName);
		return marketActives;
	}
}
