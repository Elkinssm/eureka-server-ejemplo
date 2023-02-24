package com.dh.infoservice.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InfoService {

    public Map<String, Object> getInfo() {
        Map<String, Object> info = new HashMap<>();
        info.put("name", "my-service");
        info.put("description", "This is a sample microservice built with Spring Boot");
        info.put("version", "1.0.0");
        return info;
    }
}
