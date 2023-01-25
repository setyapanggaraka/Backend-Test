package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

    @GetMapping
    public String welcome() {
        return "Welcome to Spring Boot";
    }

    @GetMapping("/coba")
    public int myMethod() {
        int limit = 10, past, current, fibonacci;
        past = 1;
        current = 1;
        fibonacci = 1;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(fibonacci);

        for (int i = 1; i <= limit; i++) {
            fibonacci = past + current;
            past = current;
            current = fibonacci;
            arr.add(fibonacci);
        }
        System.out.print(arr);
        return fibonacci;
    }

    @GetMapping("/fibonacci/{n}")
    public List<Integer> getFibonacci(@PathVariable int n) {
        List<Integer> result = new ArrayList<>();
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int temp = a + b;
            if (temp % 2 != 0) {
                result.add(temp);
            }
            a = b;
            b = temp;
        }
        return result;
    }
}
