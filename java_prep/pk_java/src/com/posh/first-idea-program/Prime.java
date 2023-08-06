package com.posh;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
       boolean ans= prime(n);
        System.out.println(ans);


    }

    static boolean prime(int n)
    {
        int i=2;
        int count=0;
        if(n<=1)
        {
            return false;
        }

        while(i*i<=n)
        {
            if(n%i==0)
            {
                return false;
            }
            i++;
        }

        return i * i > n;


    }
}
