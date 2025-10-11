package com.string;

public class AnagramString {
    public static void main (String[] args) {

        String s1="listen";
        String s2="silent1";
        if(isAnagram (s1,s2)){
            System.out.println ("String is anagram");
        }else
            System.out.println ("String is not anagram");

    }
    static boolean isAnagram(String s1,String s2){
        boolean result=true;
        if(s1.length ()!=s2.length ()){
            result=false;
        }
        int[] count=new int[256];
        for(char c:s1.toCharArray ())//ch[]{l,i,s,t,e,n}
        {
            count[c]++;
        }
        for (char c:s2.toCharArray ()){
            count[c]--;
            if(count[c]<0){
                result=false;
            }
        }
        return result;
    }
}
