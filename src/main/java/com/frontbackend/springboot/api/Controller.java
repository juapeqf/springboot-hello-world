package com.frontbackend.springboot.api;

import com.frontbackend.springboot.controllers.models.SumaObject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.frontbackend.springboot.services.*;



@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    TestService testService;


    @RequestMapping("/test")
    String test() {
        return "Hello World!";
    }

    @PostMapping("/suma")
    ResponseEntity suma(@RequestBody SumaObject pSumaObject ) {

        JSONObject result = new JSONObject();

        result.put("result", testService.suma( pSumaObject.getNumero1(), pSumaObject.getNumero2()) );

        return new ResponseEntity<>( result.toString(), HttpStatus.OK );
    }

}
