package com.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @PostMapping("/test")
    @ResponseBody
    public String test() {
        return "test";
    }

    @PostMapping("/request/param")
    @ResponseBody
    public String requestParam(@RequestParam(value = "name", required = false, defaultValue = "name") String username) {
        String username2 = username;
        return username2;
    }
}
