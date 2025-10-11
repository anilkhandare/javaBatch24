package com.string;

public class Demo3 {
    public static void main (String[] args) {
        String apikey="abcd@1234_11";
        String modifiedapikey= apikey.concat ("abcdefgh");
        System.out.println (apikey);
        System.out.println (modifiedapikey);
        // string pool area  apikey---->abcd@1234_11
           // string pool area  abcd@1234_11abcdefgh

    }
}
