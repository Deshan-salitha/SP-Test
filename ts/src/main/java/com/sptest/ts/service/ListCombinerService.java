package com.sptest.ts.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListCombinerService {
    public List<Object> combineLists(List<Object> list1, List<Object> list2) {
        List<Object> combinedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            combinedList.add(list1.get(i));
            combinedList.add(list2.get(j));
            i++;
            j++;
        }

        // add any remaining elements from list1
        while (i < list1.size()) {
            combinedList.add(list1.get(i));
            i++;
        }

        // add any remaining elements from list2
        while (j < list2.size()) {
            combinedList.add(list2.get(j));
            j++;
        }

        return combinedList;
    }
}
