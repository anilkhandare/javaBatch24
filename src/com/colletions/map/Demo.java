package com.colletions.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Demo {
    /*mobile number : 89898989
    name:anil
    address: pune*/
    public static void main (String[] args) {
        List list= new ArrayList ();
        list.add ("mobile number : 89898989");
        list.add ("name:anil");
        list.add ("address: pune");



        String key="mobile number";
        int value=89898989;

        list.add (key);
        list.add (value);

        System.out.println (list);
        Iterator iterator= list.iterator ();
        while (iterator.hasNext ()){
            System.out.println (iterator.next ());
        }

    }


}
