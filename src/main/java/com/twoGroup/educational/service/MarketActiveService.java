package com.twoGroup.educational.service;

import com.twoGroup.educational.entities.MarketActive;
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
public interface MarketActiveService extends IService<MarketActive> {

	List<MarketActive> selectList();

	List<MarketActive> selectListLike(MarketActive marketActive);

}
