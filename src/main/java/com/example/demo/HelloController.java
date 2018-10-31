package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rabbit")
public class HelloController {
    @Autowired
    private HelloSender helloSender;

    @PostMapping("/sender")
    public void testRabbit() {
        helloSender.send();
    }
}
