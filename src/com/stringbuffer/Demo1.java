package com.stringbuffer;

public class Demo1 {
    public static void main (String[] args) {
        StringBuffer stringBuffer= new StringBuffer ();
        //stringBuffer=(StringBuffer) "abc"; compile time error
        stringBuffer.append (" vishal ");
        stringBuffer.append (" Pansare ");
        System.out.println (stringBuffer);
        StringBuffer stringBuffer1= new StringBuffer ("Sandhya ");//String s= new String("sandhya");
        stringBuffer1.append (" jadhav");
        System.out.println (stringBuffer1);

        String s= new String ("sandhya");
        s="jadhav";
        System.out.println (s);




    }
}
