package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Config {
    @Value("${prop1}")
    private String prop1;

    @Value("${prop2}")
    private String prop2;

}
