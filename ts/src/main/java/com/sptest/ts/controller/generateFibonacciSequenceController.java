package com.sptest.ts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class generateFibonacciSequenceController {
    @GetMapping("/fibonacci")
    public List<Integer> fibonacci() {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        int n1 = 0;
        int n2 = 1;
        fibonacciNumbers.add(n1);
        fibonacciNumbers.add(n2);
        for (int i = 2; i < 100; i++) {
            int n3 = n1 + n2;
            fibonacciNumbers.add(n3);
            n1 = n2;
            n2 = n3;
        }
        return fibonacciNumbers;
    }
}
