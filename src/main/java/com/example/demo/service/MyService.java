package com.example.demo.service;

import com.example.demo.model.MyModel;
import org.springframework.stereotype.Service;

@Service
public interface MyService {
    
    MyModel findNextNumber(Integer CategoryCode);
}
