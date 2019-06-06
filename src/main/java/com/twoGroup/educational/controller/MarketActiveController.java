package com.twoGroup.educational.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.pagehelper.PageHelper;
import com.twoGroup.educational.commonUtils.DataTransUtil;
import com.twoGroup.educational.commonUtils.RedisUtils;
import com.twoGroup.educational.entities.*;
import com.twoGroup.educational.entities.MarketActive;
import com.twoGroup.educational.service.MarketActiveService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;
/**
 * <p>
 * 前端控制器
 * </p>
 * 教务活动-->活动管理
 * @author lsson
 * @since 2019-05-26
 */
@RestController
@RequestMapping("marketActive")
public class MarketActiveController {
	private Logger logger = LoggerFactory.getLogger(MarketActiveController.class);
    @Autowired
	MarketActiveService marketActiveService;
	//redis
	@Autowired
	RedisUtils redisUtils;
    //所有活动信息
	private List<MarketActive> marketActives;
	//活动信息
	private MarketActive marketActive;
	/**
	 * 分页查询所有课程信息,
	 */
	@GetMapping("activitiCurrentList/{currentPage}")
	public @ResponseBody String activitiCurrentList(Map map, @PathVariable int currentPage) {

		try { System.out.println("get 活动 list"+currentPage);
		//每页显示五行数据
		PageHelper.startPage(currentPage, 5);
		marketActives = (List<MarketActive>) redisUtils.get("marketActives");
		//在redis缓存中查询是否有数据
		if (null==marketActives){
			//线程锁定只让第一位用户在数据库中访问数据
			synchronized (this){
				marketActives = (List<MarketActive>) redisUtils.get("marketActives");
				if (null==marketActives){
					marketActives = marketActiveService.selectList();
					redisUtils.set("marketActives",marketActives);
				}
			}
		}
		//获取数据
		marketActives = marketActiveService.selectList();
		//封装的总页数、总记录数、当前页数
		DataTransUtil.redisDataUtil(map,marketActives,currentPage,5);
		if (marketActives!=null) {
			//数据绑定
			map.put("list", marketActives);
			return JSON.toJSONString(map);
		}}catch (Exception e){
			PageHelper.startPage(currentPage,5);
			marketActives = marketActiveService.selectList(null);
			if (marketActives != null) {
				//数据绑定
				return DataTransUtil.dataUtil(map,marketActives);
			}
			return "false";
		}
		return "false";
	}

	/**
	 * 条件查询 活动信息
	 */
	@PostMapping("listMarketActiveLike")
	public @ResponseBody String listMarketActiveLike(Map<String,Object> map,int currentPage ,MarketActive marketActive) {
		//每页显示五行数据
		PageHelper.startPage(currentPage, 5);
		if(marketActive.getActiveState()==null)
			System.out.println(marketActive);
		//判断有无条件
		marketActives = marketActiveService.selectListLike(marketActive);
		return DataTransUtil.dataUtil(map, marketActives);
	}
	/**
	 * 查询添加活动信息
	 */


	/**
	 * 添加活动信息
	 */
	@PostMapping("saveMarkeActive")
	public @ResponseBody String saveMarkeActive(MarketActive markeActive) {
		System.out.println("添加 活动" + markeActive);
		markeActive.setStaffId(80);
		boolean insert = marketActiveService.insert(markeActive);
		if (!insert) {
			return "false";
		}
		return "true";
	}

	/**
	 * 更新活动信息的条件查询
	 */
	@GetMapping("saveOrUpdate/condition/{activeId}")
	public @ResponseBody String condition(@PathVariable String activeId,Map map) {
		//修改操作、有disciplineId参数
		try {
			marketActive = marketActiveService.selectById(activeId);
			System.out.println("获取更新数据"+activeId+marketActive);
			return DataTransUtil.oneObjDataUtil(map,"marketActive",marketActive);
		} catch (Exception e) {
			return "false";
		}
	}
	/**
	 * 更新活动信息
	 */
	@PutMapping("updateMarkeActive/{activeId}")
	public @ResponseBody String updateMarkeActive(@PathVariable String activeId,MarketActive markeActive){
		try {
			System.out.println("更新活动"+activeId+markeActive);
			boolean b = marketActiveService.updateById(markeActive);
			if (b==true){
				redisUtils.delete("marketActives");
				return "true";
			}else {
				return "false";
			}
		} catch (Exception e) {
			return "false";
		}
	}

	/**
	 * 删除课程信息
	 */
	@DeleteMapping("deleteMarkeActive/{activeId}")
	public @ResponseBody String deleteMarkeActive(@PathVariable String activeId) {
		try {
			System.out.println("删除 活动"+activeId);
			boolean b = marketActiveService.deleteById(Integer.parseInt(activeId));
			if (b == false) {
				return "false";
			}
			return "true";
		} catch (Exception e) {
			return "false";
		}
	}
}