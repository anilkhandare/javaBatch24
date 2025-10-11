package com.multihreading.threadgroup;

public class CheckAccessSecurityManager {
    public static void main (String[] args) {
        System.setSecurityManager (new SecurityManager ()
                                   {
                                       @Override
                                       public void checkAccess (ThreadGroup g) {
                                           throw new SecurityException ("modification not not allowed");
                                       }
                                   }

        );
        ThreadGroup threadGroup = new ThreadGroup ("RestrictedGroup");
        try{
            threadGroup.checkAccess ();
            System.out.println ("access granted");
        }catch (SecurityException e){
            System.out.println ("access denied:"+e.getMessage ());
        }
    }
}
