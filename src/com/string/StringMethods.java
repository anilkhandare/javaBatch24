package com.string;

import java.util.Arrays;
import java.util.Date;

public class StringMethods {
    public static void main (String[] args) {
        //length
        char[] ch = {'A', 'B'};
        System.out.println ("arrays length:" + ch.length);// public final int length(length variable to return arrays length
        String s = " Sandhya ";
        System.out.println ("String length:" + s.length ());

        // charAt(int index)// this is used to return character at specific index
        System.out.println ("specific index charter:" + s.charAt (1));
        // codePointAt(int index)return unicode
        System.out.println ("return unicode:" + s.codePointAt (1));
        //substring
        System.out.println ("substring of the Sandhya:" + s.substring (3));

        String token = "token123456";
        String sub = token.substring (5);
        System.out.println (sub);
        String sub2 = token.substring (0, 5);
        System.out.println (sub2);
        String account = "12345678090";
        String parseacount = account.substring (6);
        System.out.println ("masked account:" + parseacount);
        //split method
        String text = "vishal,Sandhya,anil";
        String[] names = text.split (",");
        System.out.println (Arrays.toString (names));
        String hahstaginputs = "#fashan,#Styel,#shop";
        String[] hashtags = hahstaginputs.split ("\\s+");
        for (String hashtag : hashtags) {
            System.out.println ("hashtag:" + hashtag);
        }
        String url = "https://www.instagram.com/techmahajanpvt/";
        String[] part = url.split ("/");
        String username = part[3];
        System.out.println ("username:" + username);
// csv name,email,mobile
        String name = " Sandhya    ";
        System.out.println ("length of name:" + name.length ());
        String newName = name.trim ();
        //String trimdata=name.trim ();
        System.out.println ("length of name:" + newName.length ());
        String str1 = " hello good ";
        System.out.println (str1 + "morning");//without trim
        System.out.println (str1.trim () + "morning");// with trim
        System.out.println ("index of :" + name.indexOf ("dh"));

        //index of method operation
        int index1 = str1.indexOf ("good");
        System.out.println (index1);
        int index2 = str1.indexOf ("hello", 4);
        System.out.println (index2);
        System.out.println (str1.indexOf ('h'));
        String str2 = "anil";
        str2 = "ak";
        System.out.println (str2);

        // string compare methods
        // equals();
        String bookname = "PSQL";
        String bookname1 = "SQL";
        String username1 = new String ("sandhya");
        // String username2 = new String ("SANDHYA");
        String inputuser = "SANDHYA";

        if (username1.equals (inputuser)) {
            System.out.println ("login successful");
        }
        if (username1.equalsIgnoreCase (inputuser)) {
            System.out.println ("login successful");
        }

        System.out.println (bookname.equals (bookname1));
        System.out.println (bookname.equalsIgnoreCase (bookname1));

        System.out.println ("==operator to compare:" + bookname == bookname1);
        System.out.println ("=====compareTo()==========");

        System.out.println (bookname.compareTo (bookname1));

        System.out.println ("===========startWith() and endWith()===========(prefix and suffix)");
        System.out.println (bookname.startsWith ("P"));
        System.out.println (bookname.endsWith ("u"));
        String courseName = "Java Fullstack Development course";
        System.out.println (courseName.startsWith ("Java"));
        System.out.println (courseName.endsWith ("course"));
        System.out.println ("==============concatenation=========");
        System.out.println ("he" + "llo");
        System.out.println (1 + 1);
        String str3 = "Raj";
        String str4 = "Ajay";
        System.out.println (str3 + str4);
        System.out.println (str3.concat (str4));
        String result = String.join (str3, str4, "vishal", "sandhya");
        System.out.println ("result using join method:" + result);
        System.out.println (String.join (str3, str4));
        // format method
        String studname = "Sandhya";
        int age = 25;
/*
        String output=String.format ("Name: %s , Age: %d",studname,age);
*/
/*
        System.out.println (output);
*/
        System.out.println (String.format ("|%-10s|%10s|", "left", "right"));
        Date today = new Date ();
        System.out.println ("without format date:" + today);
        System.out.println (String.format ("Date: %tD,Time: %tT", today, today));//MM/DD/YY
        System.out.println (String.format ("Date: %tF,Time: %tr", today, today));//YYYY-MM-DD
        System.out.println (String.format ("Date: %tA,Time: %tB", today, today));// weekday // full month
        System.out.println ("============contains=============== ");
        String blog = "java is a pure object oriented programing language";
        System.out.println ("find the " + "a" + " in blog:" + blog.contains ("A"));
        System.out.println ("find the " + "object" + " in blog:" + blog.contains ("object"));
        System.out.println ("find the " + "sandhya" + " in blog:" + blog.contains ("sandhya"));
        boolean isContains = blog.contains ("oriented");
        if (isContains) {
            System.out.println (blog);
        } else
            System.out.println ("contains not found");
        System.out.println ("=======isEmpty()===========");
        String emptystring = "";
        String notempty = "abcdefg";
        String isnull = null;
        System.out.println (emptystring.isEmpty ());
        System.out.println (notempty.isEmpty ());
        //System.out.println (isnull.isEmpty ());
        if (isnull == null) {
            System.out.println ("is null value");
        } else
            System.out.println ("is not null");

        System.out.println ("=========replace()==========");
        String oldNameOfSandhya = "Sandhya Jadhav";
        System.out.println ("oldNameOfSandhya:" + oldNameOfSandhya);
        String newNameofSandhya = oldNameOfSandhya.replace ("Jadhav", "xyzs");
        System.out.println ("new name:" + newNameofSandhya);
        // String.Intern() method

/*        String str5="classA";
        String str6="classA";
        System.out.println (str5==str6);*/
/*        String str5=new String ("classA");
        String str6 = new String ("classA");
        System.out.println ("string comparison"+str5==str6);
        System.out.println ("str5 and str6 : "+str5 +" "+ str6);*/

        String str7 = new String ("classA").intern ();
        String str8 = new String ("classA").intern ();
        System.out.println ("===================");
        System.out.println ("string comparison" + str7 == str8);
        /* System.out.println ("str5 and str6 : "+str5 +" "+ str6);*/


        String strInLowerCase = str7.toLowerCase ();
        System.out.println (strInLowerCase);
        String strInUperCase=str7.toUpperCase ();
        System.out.println (strInUperCase);
        int a=40;
        String str9=String.valueOf (a);
        System.out.println (str9+10);
        Object obj= new Object ();
        String str10= String.valueOf (obj);
        System.out.println (str10);


    }
}
