
package com.multihreading.daemonthread;

public class SessionClean extends Thread {
    private final SessionManager sessionManager;

    public SessionClean (SessionManager sessionManager) {
        this.sessionManager = sessionManager;
        setDaemon (true);
    }

    @Override
    public void run () {
        sessionManager.cleanSession ();
        try {
            sleep (2000);
        } catch (Exception e) {
            throw new RuntimeException (e);
        }

    }

    public static void main (String[] args) throws InterruptedException {
        SessionManager sessionManager1 = new SessionManager ();
        SessionClean sessionClean = new SessionClean (sessionManager1);
        sessionClean.start ();
        sessionManager1.addNewSession ("user1");
        sessionManager1.addNewSession ("user2");
        System.out.println ("Main thread is running .....");
        sleep (2000);
    }
}




