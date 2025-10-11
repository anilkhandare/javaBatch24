package com.interfacedemo;

import java.io.Serializable;
import java.rmi.Remote;

public interface MarkerInterface extends Serializable,Cloneable, Remote

{
    default void test(){

    }
    static  void test2(){

    }
}
