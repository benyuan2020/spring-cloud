package com.gaiaworks.controller;

import com.gaiaworks.service.HystricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Delayed;

@RestController
public class HystricController {

    @Autowired
    private HystricService hystricService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return  hystricService.sayHiFromClientOne(name);
    }


}
