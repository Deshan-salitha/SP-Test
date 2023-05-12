package com.sptest.ts.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FibonacciService {
    public List<Integer> generateFibonacciSequence(int n) {
        List<Integer> fibonacciSequence = new ArrayList<>();

        int a = 0;
        int b = 1;

        fibonacciSequence.add(a);
        fibonacciSequence.add(b);

        for (int i = 2; i < n; i++) {
            int c = a + b;
            fibonacciSequence.add(c);

            a = b;
            b = c;
        }

        return fibonacciSequence;
    }
}
