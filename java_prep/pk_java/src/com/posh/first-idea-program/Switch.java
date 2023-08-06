package com.posh;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
//        String fruit=in.next();

//        if(fruit.equals("mango"))
//        {
//            System.out.println("King of fruits");
//        }


//        String a= "Posh";
//        String b="Posh";
//        System.out.println(a == b);

//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruits");
//            case "apple" -> System.out.println("A sweet red fruit");
//            case "orange" -> System.out.println("Round fruit");
//            default -> System.out.println("Pls enter a valid fruit");
//        }

        int day=in.nextInt();

//        switch (day) {
//            case 1 -> System.out.println("Start your journey");
//            case 30 -> System.out.println("Congrats for completing one month in course");
//            case 60 -> System.out.println("Congrats for completing two months in course");
//            case 90 -> System.out.println("Congrats for completing three months in course");
//            case 120 -> System.out.println("Congrats for completing your course");
//            default -> System.out.println("You should work hard buddy");
//        }

//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }


    }
}
