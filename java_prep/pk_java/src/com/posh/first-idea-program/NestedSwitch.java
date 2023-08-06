package com.posh;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int EmpID=in.nextInt();
        String Dept=in.next();

        switch (EmpID)
        {
            case 1:
                System.out.println("Employee no 1");
                break;
            case 2:
                System.out.println("Employee no 2");
                break;
            case 3:
                switch (Dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("Enter a valid department");
                }
                break;

            default:
                System.out.println("Enter valid EmpID");
                break;
        }


    }
}
