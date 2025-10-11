package com.com.exception.handling;

public class CustomExceptionMainClass {

    InSufficientBalException inSufficientBalException;
    public  void test() throws CustomExceptionHandling {
         throw new CustomExceptionHandling ("this is the custom excepton");
    }
    public  void balance(int i) throws InSufficientBalException{

        try {
            int total = i / 0;
        }catch (ArithmeticException e) {
            throw new InSufficientBalException (inSufficientBalException.getHttpStatus (),inSufficientBalException.getCode ());
        }


    }

    public static void main (String[] args){
        CustomExceptionMainClass customExceptionHandling= new CustomExceptionMainClass ();

            customExceptionHandling.balance (10);


    }
}
