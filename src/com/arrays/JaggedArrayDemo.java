package com.arrays;

import java.util.Arrays;

public class JaggedArrayDemo {
    public static void main (String[] args) {
        int arr1[][]= new int[3][];
        int arr2[][]= {{1,2},{1,2,3},{1}};
        int i1[]={1,8,3,9,0,4};
        Arrays.sort (i1,1,4);//i[1] ro i[3]
        System.out.println (Arrays.toString (i1));
        for(int i=0;i<arr2.length;i++){
            System.out.println ("rows:"+i);
            for (int j=0;j<arr2[i].length;j++){
                System.out.println ("col:"+j+" "+arr2[i][j]);
            }
            System.out.println ();

        }

    }
}
