package com.posh;

public class Overloading {
    public static void main(String[] args) {
//        func(72);
        func("Posh");
    }//at compile time it decides which function should run..

    static void func(int a){
        System.out.println("First one");
        System.out.println(a);
    }
    static void func(String name){
        System.out.println("Second one");
        System.out.println(name);
    }
}
