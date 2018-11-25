package org.my.multi.module.two.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/sampleApp")
public class WebController2 {

    @GetMapping("/two")
    public String helloAppTwo() {
        return "hello from app two";
    }

}
