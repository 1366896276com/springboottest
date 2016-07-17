package cn.zc.springtest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//方式2
@RestController
public class Example {
	@RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
