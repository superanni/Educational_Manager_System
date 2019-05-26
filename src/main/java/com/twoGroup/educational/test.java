package com.twoGroup.educational;

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

    @GetMapping("saveOrUpdate/{page}")
    public String testModifyData(@PathVariable String page){
        return "manager/developmentManage/saveOrUpdate/"+page;
    }
}
