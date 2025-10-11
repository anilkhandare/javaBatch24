package control.statements.forloop.nestedforloop;

public class Demo {
    public static void main (String[] args) {

        for (int i=1;i<=1;i++){

            System.out.println ("=========="+i+"==========");
            for (int j=1;j<=5;j++){
                System.out.println ("i:"+i+"j:"+j);
            }


        }
    }
}
