package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative1 {
    public static void main (String[] args) {
        List<Integer> integerList = Arrays.asList (1, 2, 3, 3, 3, 4, 5, 6, 7, 8, 9, 10, 10);
        List<Integer> uniquelist = new ArrayList<> ();
        for (Integer integer : integerList) {
            if (!uniquelist.contains (integer)){
                uniquelist.add (integer);
            }
        }
        System.out.println (uniquelist);

        List<Integer> uniquerecords=integerList.stream ().distinct ().collect (Collectors.toList ());
        System.out.println (uniquerecords);
    }

}
