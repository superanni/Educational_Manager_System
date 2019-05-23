package com.TwoGroup.Educational;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试RestController连接
 */
@RestController
public class test {

    @GetMapping("/test")
    public @ResponseBody String test(){
        return "你好啊";
    }
}
