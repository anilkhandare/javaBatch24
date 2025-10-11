package com.interfacedemo;

@FunctionalInterface
public interface AudiOperation {
    public void auditOperation();
//    public  void auditOperation2();
     default void test(){

     }
     static  void  test2(){

     }
}
