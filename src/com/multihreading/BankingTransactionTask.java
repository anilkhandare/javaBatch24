package com.multihreading;

public class BankingTransactionTask extends  Thread{
    /**
     * Allocates a new {@code Thread} object. This constructor has the same
     * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
     * {@code (null, null, name)}.
     *
     * @param name the name of the new thread
     */
    public BankingTransactionTask (String name,int priority ) {
        super (name);
        setPriority (priority);
    }

    @Override
    public void run () {
        System.out.println (getName ()+"running with priority:"+getPriority ());
        try {
            sleep (1000);
        } catch (InterruptedException e) {
            throw new RuntimeException (e);
        }
    }
}
