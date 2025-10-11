package com.enumeration;

import com.sun.webkit.ThemeClient;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CallProcessor {
    private static final Logger LOGGER=Logger.getLogger (CallProcessor.class.getName ());
    public  void processCall(String callId,CallState state) {
        String message=String.format ("Call ID: %s,State: %s - %s",callId,state.name (),state.getDescription ());
        LOGGER.info (message);

     try {
         switch (state){
             case INITIATE:
                 Thread.sleep (2000);
                 processCall (callId,CallState.CONNECTED);
                 break;
             case CONNECTED:
                 Thread.sleep (3000);
                 processCall (callId,CallState.ON_HOLD);
                 break;
             case ON_HOLD:
                 Thread.sleep (2000);
                 processCall (callId,CallState.DISCONNECTED);
                 break;
             case DISCONNECTED:
                 LOGGER.info ("Call"+callId+ "has ended");
         }
     }catch (InterruptedException interruptedException){
         LOGGER.log (Level.SEVERE,"Intrupted Exception during call process"+interruptedException.getMessage ());
         Thread.currentThread ().interrupt ();
     }

    }
}
