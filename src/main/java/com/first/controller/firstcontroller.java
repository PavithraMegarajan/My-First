package com.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class firstcontroller {

    @GetMapping
    public String getStatus()
    {
        return "Application is running";
    }

}
