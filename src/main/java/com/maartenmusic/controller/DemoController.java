package com.maartenmusic.controller;

import com.maartenmusic.service.DemoService;
import com.maartenmusic.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

    // == Fields ==

    private final DemoService demoService;

    // == Constructors ==

    @Autowired
    public DemoController(DemoService demoService){
        this.demoService = demoService;
    }

    // == Request methods ==

    // http://localhost:8080://todo-list/hello
    @ResponseBody
    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    // http://localhost:8080://todo-list/welcome
    // http://localhost:8080://todo-list/welcome?user=Maarten

    @GetMapping("welcome")
    public String welcome(@RequestParam String user, @RequestParam int age, Model model) {
        model.addAttribute("helloMessage", demoService.getHelloMessage(user));
        model.addAttribute("age", age);
        log.info("model= {}", model);
        // ViewResolver -> prefix + name (from return value) + suffix
        // /WEB_INF/view/welcome.jsp
        return ViewNames.WELCOME;
    }

    // == Model attributes ==

    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("welcomeMesssage() called");
        return demoService.getWelcomeMessage();
    }
}
