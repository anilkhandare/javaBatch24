package keywords.TryKeyword;

import java.rmi.server.ExportException;

public class TryKeyword {

    public static void main (String[] args) {
        try{
           int i=10/0;
        }catch (Exception e){
            System.out.println ("logic is wrong"+e);
        }finally {
            System.out.println ("finally");
        }
    }

}
