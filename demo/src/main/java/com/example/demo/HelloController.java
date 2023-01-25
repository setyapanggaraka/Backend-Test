package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String greeting() {
        return "HEllo World";
    }

}
