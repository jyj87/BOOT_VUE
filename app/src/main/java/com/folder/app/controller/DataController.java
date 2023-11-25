package com.folder.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @CrossOrigin(origins = "http://localhost:8800")
    @GetMapping("/")
    public String home() {
        return "Data 준비중....";
    }

    @GetMapping("/api")
    public String api() {
        return "api 준비중....";
    }

    @PostMapping("/findAll")
    public void findAll() {

    }

    @PostMapping("/editById")
    public void editById() {

    }

    @DeleteMapping("/delete")
    public void delete() {

    }

    @PutMapping("save")
    public void save() {
    }
}
