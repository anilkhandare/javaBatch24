package com.polymorphism.runtimepolymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void processNotification(List<Notification> notifications) {
        for (Notification notification : notifications){
            if (notification instanceof TexNotification) {
                TexNotification texNotification = (TexNotification) notification;
                texNotification.display ();
               // System.out.println ("test notification");
            }
        if (notification instanceof ImgeNotification) {
            ImgeNotification imgeNotification = (ImgeNotification) notification;
            imgeNotification.display ();
            //System.out.println ("ImgeNotification notification");
        }
    }
    }

    public static void main (String[] args) {
        List<Notification> notifications= new ArrayList<> ();
        notifications.add (new ImgeNotification ("this is my image notifcation downcasting demo "));
        notifications.add (new TexNotification ("this is my text notifcation downcasting demo "));
        processNotification(notifications);

    }
}
