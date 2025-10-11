package control.statements;

public class IfCondition {
    public static void main (String[] args) {

        String username="admin1";
        String password="admin";

        if(username.equals ("admin") && password.equals ("admin"))
        {
            System.out.println ("welcome back");
        }else
            System.out.println ("invalid username or password ");

    }
}
