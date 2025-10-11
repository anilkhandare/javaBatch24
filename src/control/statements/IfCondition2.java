package control.statements;

public class IfCondition2 {
    public static void main (String[] args) {

        String level="3";

        if(level=="1")
        {
            System.out.println ("You passed level 1");
        }else if(level=="2") {
            System.out.println ("You Passed level 2 ");
        }
        else if(level=="3") {
            System.out.println ("You Passed level 3 ");
        }else
            System.out.println ("gave over");


    }
}
