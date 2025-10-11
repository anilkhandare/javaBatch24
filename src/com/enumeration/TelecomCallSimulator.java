package com.enumeration;


public class TelecomCallSimulator {
    public static void main (String[] args) {
        CallProcessor callProcessor= new CallProcessor ();
        String callId="CALL_001";
        System.out.println ("Starting call simulator for "+callId);

        Thread callThread = new Thread (()->callProcessor.processCall (callId,CallState.INITIATE));
        callThread.start ();

        try {
            callThread.join (10000);
            if(callThread.isAlive ()){
                callThread.interrupt ();
                System.out.println ("all simulation time out .");
            }
        }catch (InterruptedException e){
            System.out.println ("Intrupted Exception during main thread"+e.getMessage ());
            Thread.currentThread ().interrupt ();
        }
        System.out.println ("call simulation completed");



    }
}
