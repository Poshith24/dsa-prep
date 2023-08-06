package com.posh;

public class swap_example {
    public static void main(String[] args) {
        int a=25;
        int b=13;
        System.out.println("Before swapping a:"+a);
        System.out.println("Before swapping b:"+b);

        swap(a,b);



    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping a:"+a);
        System.out.println("After swapping b:"+b);


    }
}
