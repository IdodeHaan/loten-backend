package com.haanido.lotenbackend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
//@CrossOrigin("http://localhost:4200")
@CrossOrigin
public class LotenController {

    @GetMapping("/loten/{aantal}")
    public Integer loot(@PathVariable int aantal) {
        return new Random().nextInt(aantal) + 1;
    }

    @GetMapping("/hello-world")
    public String hello() {
        return "Hello world!";
    }
}
