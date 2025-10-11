package keywords.throwandthrows;

public class ThrowKeyword {
    public static void main (String[] args) {
        int year=1;
        if(year<2){
            throw  new ArithmeticException (" not eligle for promotion");
        }else
            System.out.println ("eligible for promotion");
    }
}
