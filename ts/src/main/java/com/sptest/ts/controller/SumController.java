package com.sptest.ts.controller;

import com.sptest.ts.service.SumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class SumController {
    @Autowired
    private SumService sumService;

    int[] numbers = {10, 20, 30, 40};

    @GetMapping("/sum/for-loop")
    @ResponseBody
    public int sumWithForLoop() {
        return sumService.sumWithForLoop(numbers);
    }

    @GetMapping("/sum/while-loop")
    @ResponseBody
    public int sumWithWhileLoop() {
        return sumService.sumWithWhileLoop(numbers);
    }

    @GetMapping("/sum/recursion")
    @ResponseBody
    public int sumWithRecursion() {
        return sumService.sumWithRecursion(numbers, 0);
    }
}
