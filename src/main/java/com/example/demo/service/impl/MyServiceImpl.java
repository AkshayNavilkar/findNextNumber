package com.example.demo.service.impl;

import com.example.demo.model.MyModel;
import com.example.demo.repository.MyRepository;
import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;

public class MyServiceImpl implements MyService{
    
    @Autowired
    private MyRepository myRepository;

    @Override
    public MyModel findNextNumber(Integer CategoryCode) {
        return null;
    }
}
