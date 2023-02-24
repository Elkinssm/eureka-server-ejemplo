package com.dh.infoservice.controller;

import com.dh.infoservice.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping
    @ResponseBody
    public Map<String, Object> getInfo() {
        Map<String, Object> response = new HashMap<>();
        response.put("app", infoService.getInfo());
        return response;
    }

    @GetMapping("/hola")
    public String msj() {
        return "Hola Mundo";
    }
}
