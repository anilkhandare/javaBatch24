package com.colletions;

import java.util.*;

public class Demo1 {
    public static void main (String[] args) {


        int[] arr= new int[4];//[0,1,2]//[0,1,2,3]
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        System.out.println (Arrays.toString (arr));
        //problem with data type and size
        //arr[3]="4";
        System.out.println (Arrays.toString (arr));

        List list= new ArrayList<> ();
        list.add ("anil");
        list.add ("vishal");
        list.add (1);
        list.add (4.0);
        list.add ('c');
        list.add (true);
        list.add (null);
        System.out.println (list);
        list.add ("Sandhya");
        System.out.println (list);



    }
}
