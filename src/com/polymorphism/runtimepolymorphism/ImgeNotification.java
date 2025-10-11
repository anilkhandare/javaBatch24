package com.polymorphism.runtimepolymorphism;

public class ImgeNotification extends  Notification{
    private  String message;

    public ImgeNotification (String message) {

        this.message = message;
    }

    public String getMessage () {
        return message;
    }

    /**
     *
     */
    @Override
    void display () {
        System.out.println ("image notification:"+message);
    }
}
