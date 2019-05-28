package com.twoGroup.educational;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.twoGroup.educational.entities.DisciplineInfo;
import com.twoGroup.educational.service.DisciplineInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 测试RestController连接
 */
@Controller
public class test {

	@Autowired
	DisciplineInfoService disciplineInfoService;

	/*@GetMapping("developmentManage/{page}")
	public String test(@PathVariable String page) {
		return "manager/developmentManage/" + page;
	}*/

	@GetMapping("saveOrUpdate/{page}")
	public String testModifyData(@PathVariable String page) {
		return "manager/developmentManage/saveOrUpdate/" + page;
	}


	@GetMapping("/{page}")
	public String test1(@PathVariable String page) {
		return page;
	}

	@GetMapping("dataAndStatistics/{page}")
	public String test2(@PathVariable String page) {
		return "manager/dataAndStatistics/" + page;
	}

	@GetMapping("fileUpload/{page}")
	public String test3(@PathVariable String page) {
		return "manager/fileUpload/" + page;
	}

	@RequestMapping("/front")
	public String  frontDesk(){
		System.out.println("get in frontDesk");
		return  "frontDesk/index";
	}

	@RequestMapping("/frontStuInfo")
	public String  frontStuInfo(){
		System.out.println("get in frontStuInfo");
		return  "frontDesk/front_stu_info";
	}


}
