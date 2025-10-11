package control.statements.forloop.labledloop;

public class Demo1 {
    public static void main (String[] args) {

       outerloop:
        for(int i=1;i<4;i++){
            innerloop:
            for (int j=1;j<4;j++){
                if(j==3 && i==3){
                    System.out.println ("in the if condition label: outerloop"+i+" "+j);
                    break outerloop;
                }
                System.out.println ("j:"+j);
            }
        }
    }
}
