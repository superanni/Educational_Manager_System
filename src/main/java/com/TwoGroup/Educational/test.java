package com.TwoGroup.Educational;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 测试RestController连接
 */
@Controller
public class test {


	@GetMapping("developmentManage/{page}")
    public String test(@PathVariable String page){
        return "manager/developmentManage/"+page;
    }

	@GetMapping("/{page}")
	public String testlogin(@PathVariable String page) {
		return page;
	}

    @GetMapping("addOrUpdate/{page}")
    public String testModifyData(@PathVariable String page){
        return "manager/developmentManage/saveOrUpdate/"+page;
    }
}
