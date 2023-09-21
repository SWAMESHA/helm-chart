package com.helmchart2.helmchart.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class Chart {


    @GetMapping("/show")
    public String test(){
        return "Helm Chart";
    }

}
