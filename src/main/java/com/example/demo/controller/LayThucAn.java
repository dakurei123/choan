package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/cho-an")
public class LayThucAn {
    int x = 50;
    @GetMapping
    public String lta(){
        x-=10;
        if (x <= 0)
            return "Trong may da het thuc an, xin vui long cho them!!!!!!";
        if (x <= 15)
            return "Da cho an! Trong may da het thuc an, xin vui long cho them!!!!";
        if (x <= 30)
            return "Da cho an! Sap het thuc an trong may, con: " + x + "%";
        return "Da cho an!";
    }

    @PostMapping
    public int xxx(@RequestParam int i){
        x = i;
        return x;
    }
}
