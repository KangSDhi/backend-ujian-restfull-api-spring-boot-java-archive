package com.kangsdhi.backendujianrestfullapispringbootjava.app.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/guru")
public class GuruController {

    @GetMapping("")
    public String welcomeGuru(){
        return "Hallo Guru";
    }
}
