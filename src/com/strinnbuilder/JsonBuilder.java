package com.strinnbuilder;

public class JsonBuilder {

    public static String buildJson(User user) {
            StringBuilder sb = new StringBuilder();
            sb.append("{")
                    .append("\"id\":").append(user.getId()).append(",")
                    .append("\"name\":\"").append(user.getName()).append("\"")
                    .append("}");
            return sb.toString();
        }

    public static void main (String[] args) {
        User user= new User (1,"Sandhya");
        User user1= new User (2,"Vishal");
        String json= buildJson (user);
        String json1=buildJson (user1);
        System.out.println ("json:"+json);
        System.out.println ("json1:"+json1);

    }
}
