package com.twoGroup.educational;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 测试RestController连接
 */
@Controller
public class test {

    @GetMapping("teachManager/{page}")
    public String test(@PathVariable String page){
        return "manager/teachManager/"+page;
    }

    @GetMapping("saveOrUpdate/{page}")
    public String testModifyData(@PathVariable String page){
        return "manager/teachManager/saveOrUpdate/"+page;
    }

	@GetMapping("teachActiviti/{page}")
	public String test2(@PathVariable String page){
		return "manager/teachManager/"+page;
	}
}
