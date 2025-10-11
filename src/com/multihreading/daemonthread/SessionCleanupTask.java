package com.multihreading.daemonthread;

public class SessionCleanupTask implements  Runnable{
    public final  SessionManager sessionManager;

    public SessionCleanupTask (SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void run () {
        try {
            sessionManager.cleanSession();
        }catch (Exception e){
            System.out.println ("error accouter at cleanup session");
        }

    }
}
