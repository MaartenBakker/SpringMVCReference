package com.maartenmusic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "<h1>hello</h1>";
    }

    // http://localhost:8080://todo-list/welcome
    // ViewResolver -> prefix + name (from return value) + suffix
    // /WEB_INF/view/welcome.jsp
    @GetMapping("welcome")
    public String welcome() {
        return "welcome";
    }
}
