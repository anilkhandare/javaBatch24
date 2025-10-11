package com.stringbuffer;

public class DeleteEcapmle {
    public static void main (String[] args) {
        StringBuffer stringBuffer= new StringBuffer ("sandhya");
        stringBuffer.append ("Jadhav");
        System.out.println (stringBuffer);
        stringBuffer.delete (0,7);//remove the substring
        System.out.println ("after delete:"+stringBuffer);
        stringBuffer.deleteCharAt (1);
        System.out.println ("after delete using charAt: "+stringBuffer);
    }
}
