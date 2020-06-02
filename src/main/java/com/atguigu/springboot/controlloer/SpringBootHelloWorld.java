package com.atguigu.springboot.controlloer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @create 2020-05-31 13:39
 */
@RestController
public class SpringBootHelloWorld {

    @GetMapping("/hello")
    public String HelloWorldSpringboot(){
        return "简单的springboot主程序";
    }
}
