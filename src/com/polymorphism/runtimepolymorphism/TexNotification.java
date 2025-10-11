package com.polymorphism.runtimepolymorphism;

public class TexNotification extends Notification{
    private  String message;

    public TexNotification (String message) {

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
        System.out.println ("text notification:"+message);
    }
}
