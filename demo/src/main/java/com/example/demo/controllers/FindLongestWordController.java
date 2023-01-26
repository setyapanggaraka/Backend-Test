package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/longest")
public class FindLongestWordController {

    @PostMapping
    public int findLongestWord(@RequestBody String requestBody) {
        String string1 = "abcdefghijklmnopqrstuvwxyz";
        String string2 = requestBody;

        int longestWordLength = 0;
        int currentWordLength = 0;
        for (int i = 0; i < string2.length(); i++) {
            if (string1.contains(String.valueOf(string2.charAt(i)))) {
                currentWordLength++;
            } else {
                longestWordLength = Math.max(longestWordLength, currentWordLength);
                currentWordLength = 0;
            }
        }
        System.out.println("Count of String is: " + Math.max(longestWordLength, currentWordLength));
        return Math.max(longestWordLength, currentWordLength);
    }
}
