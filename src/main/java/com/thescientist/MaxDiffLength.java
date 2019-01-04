package com.thescientist;

import java.util.Comparator;
import java.util.List;

public class MaxDiffLength {

    public static int mxdiflg(List<String> a1, List<String> a2) {
        if(a1.isEmpty()||a2.isEmpty()){
            return -1;
        }


        int a1Size = a1.stream().max(Comparator.comparingInt(String::length)).get().length();
        int a2Size = a2.stream().max(Comparator.comparingInt(String::length)).get().length();
        if(a1Size <= a2Size) {
            return a1Size-a2Size;
        } else {
            return a2Size-a1Size;
        }

    }
}
