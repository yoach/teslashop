package com.example.tesla.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("tesla/api/order")
public class OrderController {

    @GetMapping
    public String order() {
        try {
            Thread.sleep(5000);//sleep for 3 sec
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Greeting for your new tesla car , order number: " + UUID.randomUUID().toString();
    }
}
