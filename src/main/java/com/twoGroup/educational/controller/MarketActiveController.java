package com.twoGroup.educational.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.github.pagehelper.PageHelper;
import com.twoGroup.educational.commonUtils.DataTransUtil;
import com.twoGroup.educational.entities.MarketActive;
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

	private List<MarketActive> marketActives;

	private MarketActive marketActive;
	/**
	 * 分页查询所有课程信息,
	 */
	@GetMapping("activitiCurrentList/{currentPage}")
	public @ResponseBody String activitiCurrentList(Map map, @PathVariable int currentPage) {
		System.out.println("get 活动 list"+currentPage);
		//每页显示五行数据
		PageHelper.startPage(currentPage, 5);
		//获取数据
		marketActives = marketActiveService.selectList();
		if (marketActives==null) {
			return "false";
		}else{
			//数据绑定
			return DataTransUtil.dataUtil(map, marketActives);
		}
	}

	/**
	 * 条件查询 活动信息
	 */
	@PostMapping("listMarketActiveLike")
	public @ResponseBody String listMarketActiveLike(Map<String,Object> map,int currentPage ,MarketActive marketActive){
		//判断有无条件
		//每页显示五行数据
		PageHelper.startPage(currentPage, 5);
		System.out.println(marketActive.getActiveName());
		//判断有无条件
		if (!"".equals(marketActive.getActiveName())) {
			marketActives=marketActiveService.selectListLike(marketActive.getActiveName());
		}else {
			marketActives=marketActiveService.selectList();
		}
		if (marketActives != null) {
			//数据绑定
			return DataTransUtil.dataUtil(map, marketActives);
		}
		return "false";
	}

	/**
	 * 添加活动信息
	 */
	@PostMapping("saveMarkeActive")
	public @ResponseBody String saveMarkeActive(MarketActive markeActive){
		System.out.println("添加 活动"+markeActive);
		if (marketActiveService.selectOne(new EntityWrapper<MarketActive>().eq("activeName",markeActive.getActiveName()))==null){
				try {
				boolean b = marketActiveService.insert(markeActive);
				if (b==true){
					return "true";
				}else {
					return "false";
				}
			} catch (Exception e) {
				return "false";
			}
		}else {
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