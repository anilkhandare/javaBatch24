package control.statements.switchstatement;

public class Demo1 {
    public static void main (String[] args) {
        short i1=10;
        switch (i1){
            case 1:
                System.out.println ("1");
            case  2:
                System.out.println ("2");
            case 3:
                System.out.println ("3");
            case 4:
                System.out.println ("4");
                switch (i1){
                    case 1:
                        System.out.println ("inner switch");
                }
            default:
                System.out.println ("default");


        }
        int i=19;
        if(i<=10){
            System.out.println ("10");
            if(true){
                
            } else if (true) {
                
            }

        }else if(i<9){
            System.out.println ("9");
        }else if(i<13) {
            
            System.out.println ("12");
        }else
            System.out.println ("else");
    }
}
