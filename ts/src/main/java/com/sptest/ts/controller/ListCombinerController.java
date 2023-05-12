package com.sptest.ts.controller;

import com.sptest.ts.service.ListCombinerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/q2/")
public class ListCombinerController {
    @Autowired
    private ListCombinerService listCombinerService;

    @GetMapping("/combine")
    public List<Object> combineLists() {
        List<Object> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        List<Object> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        return listCombinerService.combineLists(list1, list2);
    }
}
