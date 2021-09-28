package com.frontbackend.springboot.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class TestService {

    public Integer suma( Integer pNumero1, Integer pNumero2)
    {
        return  pNumero1 + pNumero2;
    }

}
