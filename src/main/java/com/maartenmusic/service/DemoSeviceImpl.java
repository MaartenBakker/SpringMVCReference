package com.maartenmusic.service;

import org.springframework.stereotype.Service;

@Service
public class DemoSeviceImpl implements DemoService {
    @Override
    public String getHelloMessage(String user) {
        return "Hello " + user;
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to the demo application.";
    }
}
