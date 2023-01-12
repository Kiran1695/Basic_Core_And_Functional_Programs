package com.bridgelabz.basiccoreprogram;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    static boolean isLeap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year in 4 digit");
        int year = scanner.nextInt();
        while (year < 999 || year > 9999) {
            System.out.println("Wrong input");
            System.out.println("Enter year in 4 digit");
            year = scanner.nextInt();
        }
        if (isLeap(year)) {
            System.out.println(year + " is leap year");
        } else
            System.out.println(year + " is not a leap year");
        scanner.close();
    }
}
