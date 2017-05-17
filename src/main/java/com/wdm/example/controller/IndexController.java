package com.wdm.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @RequestMapping("test")
    public String testCloudApi() {
        return "test: I am server 2";
    }
}
