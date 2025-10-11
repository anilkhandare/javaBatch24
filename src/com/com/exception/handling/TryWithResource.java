package com.com.exception.handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main (String[] args) {
        try(BufferedReader reader= new BufferedReader (new FileReader ("file.txt"))){
            String line;
            while((line=reader.readLine ())!=null){
                System.out.println (line);
            }


        }catch (IOException ioException){

            //ioException.printStackTrace ();
            System.out.println (ioException.toString ());
            //ioException.getLocalizedMessage ();
            System.out.println (ioException.getMessage ()+"{}"+ioException.getCause ());
            //System.out.println (ioException.getCause ());
            System.out.println (ioException.getStackTrace ());
        }
    }
}
