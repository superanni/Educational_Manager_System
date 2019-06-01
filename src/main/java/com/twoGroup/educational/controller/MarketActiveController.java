package com.twoGroup.educational.controller;


import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.twoGroup.educational.commonUtils.DataTransUtil;
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
@Controller
@RequestMapping("marketActive")
public class MarketActiveController {
	private Logger logger = LoggerFactory.getLogger(MarketActiveController.class);
@Autowired
	MarketActiveService marketActiveService;
	private String locationURI = "manager/teachActiviti/saveOrUpdate/";      //跳转路径前缀
	private DataTransUtil dataTransUtil;        //数据传输工具

	private List<MarketActive> marketActives;

//	//直接跳转需要的页面
//	@GetMapping("{redictPage}")
//	public String templateList(@PathVariable String redictPage) {
//		System.out.println("go to " + redictPage);
//		return locationURI + "/" + redictPage;
//	}

	/**
	 * 分页查询所有课程信息,
	 */
	@GetMapping("activitiCurrentList/{currentPage}")
	public @ResponseBody String listLessonManage(Map map, @PathVariable int currentPage) {
		System.out.println("查询活动"+currentPage);
		//每页显示五行数据
		PageHelper.startPage(currentPage, 5);
		//获取数据
		marketActives = marketActiveService.selectlistMarketActive();
		if (marketActives != null) {
			//数据绑定
			return DataTransUtil.dataUtil(map, marketActives);
		}
		return "false";
	}
	/**
	 * 删除课程信息
	 */
	@DeleteMapping("activitiCurrentDelete/{activeId}")
	public @ResponseBody String deleteDiscipline(@PathVariable String disciplineId) {
		try {
			boolean b = marketActiveService.deleteById(Integer.parseInt(disciplineId));
			if (b == false) {
				return "false";
			}
			return "true";
		} catch (Exception e) {
			return "false";
		}
	}

}

