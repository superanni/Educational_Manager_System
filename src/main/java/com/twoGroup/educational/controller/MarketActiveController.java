package com.twoGroup.educational.controller;


import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.twoGroup.educational.CommonUtils.DataTransUtil;
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
 *
 * @author lsson
 * @since 2019-05-26
 */
@Controller
@RequestMapping("/teachActiviti")
public class MarketActiveController {
	private Logger logger = LoggerFactory.getLogger( MarketActiveController.class);

	@Autowired
	MarketActiveService marketActiveService;

	private String locationURI = "manager/teachActiviti";      //跳转路径前缀

	private DataTransUtil dataTransUtil;        //数据传输工具

	private List<MarketActive> marketActives;

	//直接跳转需要的页面
	@GetMapping("{redictPage}")
	public String templateList(@PathVariable String redictPage) {
		System.out.println("go to " + redictPage);
		return locationURI + "/" + redictPage;
	}

	//获取当前页数据
	@GetMapping("activitiCurrentList/{currentPage}")
	public @ResponseBody
	String TemplateCurrentList(Map<String, Object> map, @PathVariable Integer currentPage) {
		System.out.println("get activitiCurrentList!");
		PageHelper.startPage(currentPage, 5);        //获取当前页记录,每页5条
		marketActives = marketActiveService.selectList(null);
		if (marketActives != null && marketActives.size() != 0) {
			dataTransUtil = new DataTransUtil();
			System.out.println("get activitiCurrentList!"+marketActives);
			dataTransUtil.dataUtil(map, marketActives);
		} else
			logger.info("查询数据失败");
		return JSON.toJSONString(map);
	}

	//删除模板信息
	@DeleteMapping("templateDelete")
	public @ResponseBody  String templateDelete(@PathVariable Integer templateId) {
		logger.info("删除模板信息！");
		try {
			if (marketActiveService.deleteById(templateId))
				return "success";
			else return "fail";
		} catch (Exception e) {
			logger.info("删除模板异常!");
		}
		return "fail";
	}


}

