package com.multihreading.syncronisation;

import javafx.scene.control.Tab;

public class Table {

    public static synchronized void printTable(int n){
        for (int i =0;i<=6;i++){
            System.out.println (n+"X "+i+"="+(i*n));

        }
    }

    public static void main (String[] args) {

        Thread t1= new Thread (()->Table.printTable (5));
        Thread t2= new Thread (()->Table.printTable (4));
        t1.start ();
        t2.start ();
    }

}
