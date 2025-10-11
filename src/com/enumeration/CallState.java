package com.enumeration;

public enum CallState {
   INITIATE("Call initiated"),
    CONNECTED("call connected"),ON_HOLD("call on hold"),DISCONNECTED(" call disconnected");

   private  final String description;
    CallState (String description) {
        this.description=description;
    }

    public String getDescription () {
        return description;
    }
}
