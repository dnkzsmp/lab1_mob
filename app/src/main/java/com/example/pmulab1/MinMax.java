package com.example.pmulab1;

import java.util.Collections;
import java.util.List;

public class MinMax {

    public static Object max(List<Integer> list) {
        if (!list.isEmpty())
            return Collections.max(list);
        return "Лист пустой";
    }

    public static Object min(List<Integer> list) {
        if (!list.isEmpty())
            return Collections.min(list);
        return "Лист пустой";
    }
}
