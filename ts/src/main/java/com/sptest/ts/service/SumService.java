package com.sptest.ts.service;

import org.springframework.stereotype.Service;

@Service
public class SumService {
    public int sumWithForLoop(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }
    public int sumWithWhileLoop(int[] numbers) {
        int total = 0;
        int i = 0;
        while (i < numbers.length) {
            total += numbers[i];
            i++;
        }
        return total;
    }
    public int sumWithRecursion(int[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        }
        return numbers[index] + sumWithRecursion(numbers, index + 1);
    }
}
