package com.folder.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @GetMapping("/")
    public String home() {
        return "Data 준비중....";
    }

    @GetMapping("/1")
    public String home1() {
        return "Data1 준비중....";
    }
}
