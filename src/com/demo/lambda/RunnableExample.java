package com.demo.lambda;

public class RunnableExample {

    public static void main (String[] args) {
        Runnable runnable= new Runnable () {
            @Override
            public void run () {
                System.out.println ("main thread old way and anynomeous class ");
            }
        };
        new Thread (runnable).start ();
        // implementing runnable using java 8 feature lamblda expression
         Runnable runablelambda=()->{
             System.out.println ("runnable implementation using lambda expression");
         };
         new Thread (runablelambda).start ();
         // without curlybraces
        Runnable runnable1=()-> System.out.println ("inside runnable 3");
 new Thread (runnable1).start ();
  new Thread (new Runnable () {
      @Override
      public void run () {
          System.out.println ("inside runnable 3.1");
      }
  }).start ();

 new Thread(()-> System.out.println ("inside runnable 4")).start ();
    }

}
