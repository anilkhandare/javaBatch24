package com.demo;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main (String[] args) {
        fizzBuzz (5);
    }

    static List<String> fizzBuzz (int n) {
        List<String> list = new ArrayList<> ();
        for (int curr = 1; curr <= n; curr++) {
            if (curr % 3 == 0 && curr % 5 == 0) {
                list.add ("fizzbuzz");
                System.out.println ("fizzBuzz");
            } else if (curr % 3 == 0) {
                list.add ("fizz");
                System.out.println ("fizz");

            } else if (curr % 5 == 0) {
                list.add ("buzz");
                System.out.println ("buzz");
            }
        }
        return list;
    }
}
