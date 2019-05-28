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

	@GetMapping("saveOrUpdate/{page}")
	public String testModifyData(@PathVariable String page) {
		return "manager/developmentManage/saveOrUpdate/" + page;
	}

	@GetMapping("saveOrUpdate1/{page}")
	public String testModifyData1(@PathVariable String page) {
		return "manager/fileUpload/saveOrUpdate/" + page;
	}

	@GetMapping("saveOrUpdate2/{page}")
	public String testModifyData2(@PathVariable String page) {
		return "manager/teachActiviti/saveOrUpdate/" + page;
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

	@GetMapping("teachActiviti/{page}")
	public String test4(@PathVariable String page) {
		return "manager/teachActiviti/" + page;
	}


	@GetMapping("frontDesk/{page}")
	public String test5(@PathVariable String page) {
		return "frontDesk/" + page;
	}

}
