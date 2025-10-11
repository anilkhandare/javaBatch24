package com.enumearation;


import java.util.HashMap;
import java.util.Map;

public class SimpleJWTExample {
    static Map<String, Users> user = new HashMap<> ();

    public static void main (String[] args) {
        user.put ("sandhya@gamil.com", new Users ("sandhya@gamil.com", "sandhya123", UserRole.CUSTOMER));
        user.put ("vishal@gamil.com", new Users ("vishal@gamil.com", "vishal123", UserRole.EMPLOYEE));
        String token=login("vishal@gamil.com","vishal123");
        System.out.println ("valid token it should be with role:"+token);
        accessBalance (token);

    }
    public static String login(String username,String pass){
        Users user1=user.get (username);
        System.out.println (user1);
        if(user1!=null && user1.password.equals (pass)){
            String token= username +"|" + user1.userRole;
            System.out.println ("Login sucessfull Token:"+token);
            return token;
        }else
            System.out.println ("invalid login attempt");
         return null;
    }
    static void accessBalance(String token){
       UserRole role=  getExtractRoleFromToken (token);
       if(role==UserRole.CUSTOMER){
           System.out.println ("Balance:2000");
       }else
           System.out.println ("access denied for others customer can have only access to see the balance");
    }
    static  UserRole getExtractRoleFromToken(String token){
        if(token!=null){
            String[] parts= token.split ("\\|");
            return UserRole.valueOf (parts[1]);
        }
        return null;
    }
}
