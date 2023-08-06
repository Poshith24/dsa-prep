package com.posh;

import java.util.Arrays;

public class ChangeValue {

    public static void main(String[] args) {

        int[] arr={2,1,3,5,8};
        System.out.println(Arrays.toString(arr));

        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num)
    {
        num[0]=34;
    }
}
