package com.TwoGroup.Educational;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 测试RestController连接
 */
@Controller
@RequestMapping("/test")
public class test {

    @GetMapping("/{page}")
    public String test(@PathVariable String page){
        return "redirect:/"+page+".html";
    }
}
