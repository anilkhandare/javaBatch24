package com.multihreading.threadgroup;

public class CheckAccessExample {
    public static void main (String[] args) {
        ThreadGroup threadGroup= new ThreadGroup ("threadgroup");

        try {
            threadGroup.checkAccess ();
            System.out.println ("main thread has access modify the group");
        }catch (SecurityException e){
            System.out.println ("access Denied"+   e.getMessage ());
        }
    }
}
