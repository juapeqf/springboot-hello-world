package com.frontbackend.springboot.api;

import com.frontbackend.springboot.models.SumaObject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.frontbackend.springboot.services.*;



@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    TestService testService;

    public @GetMapping("/test")
    String test() {

        return "Hello World!";
    }

    @PostMapping(value = "/suma", produces = "application/json")
    public ResponseEntity suma(@RequestBody SumaObject pSumaObject ) {

        JSONObject result = new JSONObject();

        result.put("result", testService.suma(pSumaObject.getNumero1(), pSumaObject.getNumero2()));

        if ( pSumaObject.getNumero1() == 5 ){
            return new ResponseEntity<>( result.toString(), HttpStatus.BAD_REQUEST );
        }

        return new ResponseEntity<>( result.toString(), HttpStatus.OK );
    }

}
