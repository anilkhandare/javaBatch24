package com.arrays;

import java.util.Arrays;

public class TwoDArray {
    public static void main (String[] args) {
        //int matrix[][]=new int[4][2];
       // matrix[][]={{1,2,3,4,5},{2,1,3}}
        //declration
        int[][] matrix;
        //initialization
        matrix= new int[2][2];
        //int a[][] = {1,2,3,4};//single D arrays

        matrix= new int[][]{
                {1, 2}, {2, 2}
        };

        int a[][]={{1,2},{2,1}};

/*        int b[][]=new int[2][2];
        b[0][0]=1;
        b[0][1]=2;
        b[1][0]=3;
        b[1][1]=4;*/
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println ("size of array:"+b.length);
        //System.out.println ("arrays values:"+ Arrays.stream(b).iterator ());

       for (int i=0;i<b.length;i++){
           //System.out.println (Arrays.toString (b[i]));

           for(int j=0;j<b[i].length;j++) {

               System.out.println (b[i][j]);
           }

       }
      //problem statement
        int c[][]= new int[3][3];







    }
}
