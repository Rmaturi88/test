package org.example;

import org.google.*;


public class Test {
    public static void  fun()
    {
        System.out.println("fun "+cusname);

    }
    private static String name="krishna";
    private  static String cusname="radha";
    public static void main(String[] args) {
        Print ob =new Print();
        ob.output();

        System.out.println("hello" +name);
        fun();

    }
}
