package control.statements;

public class IfCondition3 {
    public static void main (String[] args) {

        String level="1,2,3,6";

        if(level.endsWith ("6")){
                    if(level.contains ("5")){
                        System.out.println ("level is 5");
                    } else if (level.contains ("6")) {
                        System.out.println ("level is 6");

                    }else
                        System.out.println ("leve is 0");
        }else
            System.out.println ("gave is over");

        
    }
}
