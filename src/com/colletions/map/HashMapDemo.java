package com.colletions.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main (String[] args) {
        Map<String,Integer> map= new HashMap ();
        map.put ("mobile number",89998989);
        map.put ("nnn",89998989);
        map.put ("mob",89998989); //mob= 23454 , BK10=mob|  89998989
        map.put ("mob",999999999);//mob= 23454 , BK10= mob | 999999999
        map.put (null,9989899);
        map.put ("",9898989);
        System.out.println (map.get ("nnn"));
        System.out.println (map.getOrDefault ("nnn",1+1));

        System.out.println (map.isEmpty ());
        System.out.println (map.values ());
        System.out.println (map.containsValue (9));
        System.out.println (map.replace ("nnn",89998989,34));






        System.out.println (map);
    }
}
