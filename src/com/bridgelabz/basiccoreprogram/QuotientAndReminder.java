package com.bridgelabz.basiccoreprogram;

import java.util.Scanner;

public class QuotientAndReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of divisor= ");
        int divisor = scanner.nextInt();
        int divident = scanner.nextInt();
        int Quotient = divident / divisor;
        int Reminder = divident % divisor;
        System.out.println("Quotient Value=> " + Quotient);
        System.out.println("Reminder Value=> " + Reminder);
    }
}
