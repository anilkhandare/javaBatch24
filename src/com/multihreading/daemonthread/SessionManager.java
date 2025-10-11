package com.multihreading.daemonthread;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class SessionManager {
    public  final Map<String,Long> activeSession= new ConcurrentHashMap<> ();
    public  void addNewSession(String sessionId){
        activeSession.put (sessionId,System.currentTimeMillis ());
    }
    public void cleanSession(){
        long now = System.currentTimeMillis ();
        activeSession.entrySet ().removeIf (entry->(now- entry.getValue ())>30*60*1000);
        System.out.println ("clean expired session active:"+activeSession.size ());
    }




}
