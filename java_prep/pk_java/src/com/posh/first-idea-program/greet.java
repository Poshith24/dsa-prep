package com.posh;

import java.util.Scanner;

public class greet {
    public static void main(String[] args) {
//        String msg=greet();
//        System.out.println(msg);

        Scanner in=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=in.next();


        String personal= Mygreet( name);
        System.out.println(personal);
    }

    private static String Mygreet(String name) {

        String msg="Hello "+name;
        return msg;
    }


    static String greet(){

        String greet="How are u?";
        return greet;
    }
}
