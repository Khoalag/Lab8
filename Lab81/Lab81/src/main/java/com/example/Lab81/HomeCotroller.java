package com.example.Lab81;

import org.springframework.web.bind.annotation.GetMapping;

@Cotroller
public class HomeCotroller {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}