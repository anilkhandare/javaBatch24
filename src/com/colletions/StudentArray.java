package com.colletions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentArray {
    public static void main (String[] args) {
        ArrayList<Student> arrayList = new ArrayList<> ();
        arrayList.add (new Student (1, "vishal"));
        arrayList.add (new Student (2, "Sandhya"));
        System.out.println (arrayList);

    }


}