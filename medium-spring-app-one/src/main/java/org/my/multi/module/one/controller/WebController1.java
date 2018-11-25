package org.my.multi.module.one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/sampleApp")
public class WebController1 {

    @GetMapping("/one")
    public String helloAppOne() {
        return "hello from app one";
    }

}
