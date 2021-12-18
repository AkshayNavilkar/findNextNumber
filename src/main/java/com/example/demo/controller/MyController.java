package com.example.demo.controller;

import com.example.demo.model.MyModel;
import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @Autowired
    private MyService myService;
    
    @GetMapping("FetchNextNumber")
    public MyModel findNextNumber(@RequestParam Integer categoryCode)
    {
        return myService.findNextNumber(categoryCode);
    }    
}
