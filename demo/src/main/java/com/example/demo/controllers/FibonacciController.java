package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {
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
        Collections.reverse(result);
        System.out.print(result);
        return result;
    }
}
