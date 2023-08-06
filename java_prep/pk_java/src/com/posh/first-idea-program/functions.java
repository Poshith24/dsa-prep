package com.posh;

import java.util.Scanner;

public class functions {

    static void sum()
    {
        Scanner in=new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("Enter number1");
        num1=in.nextInt();
        System.out.println("Enter number2");
        num2=in.nextInt();
        sum=num1+num2;
        System.out.println("The sum = " +sum);
    }

    static int sum2()
    {
        Scanner in=new Scanner(System.in);
        int num1,num2,sum;
        System.out.print("Enter number1:");
        num1=in.nextInt();
        System.out.print("Enter number2:");
        num2=in.nextInt();
        sum=num1+num2;
        return sum;

//        System.out.println("This will never execute");
    }
    static void greeting(){
        System.out.println("Hello world");
    }

    static int sum3(int a,int b)
    {
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        int ans=sum3(34,46);
        System.out.println(ans);

    }
}
