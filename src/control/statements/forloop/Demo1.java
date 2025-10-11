package control.statements.forloop;

public class Demo1 {
    public static void main (String[] args) {

        for(int i=0;i<10;i++){
            System.out.println (i);
        }
        System.out.println ("================================");
        int num[]={2,3,4,5,6};
        System.out.println ("num size: "+num.length);
        for(int j=0;j<num.length;j++){
            System.out.println (num[j]);
        }
        int sum=0;
        for (int k=0;k<10;k++){
            sum+=k;
        }
        System.out.println (sum);
    }

}
