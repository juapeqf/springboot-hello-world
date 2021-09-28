package com.frontbackend.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {


    @RequestMapping("/test")
    String test() {
        return "Hello World!";
    }

}
