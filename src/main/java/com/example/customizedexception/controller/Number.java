package com.example.customizedexception.controller;

import com.example.customizedexception.entity.EntityNumber;
import com.example.customizedexception.services.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/number")
public class Number {

    @Autowired
    NumberService numberService;

    @GetMapping("/add")
    public String calculator(@RequestBody EntityNumber num){
        return numberService.calculator(num);
    }
}
