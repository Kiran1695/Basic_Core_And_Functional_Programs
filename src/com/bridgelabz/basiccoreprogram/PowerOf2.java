package com.bridgelabz.basiccoreprogram;

import java.util.Scanner;

public class PowerOf2 {
    static void printTable(int pow) {
        int val = 1;
        for (int i = 1; i <= pow; i++) {
            val = val * 2;
            System.out.println(val);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to find power of 2 less than 32");
        int pow = scanner.nextInt();
        while (pow > 31) {
            System.out.println("invalid input");
            System.out.println("Enter value less than 32");
            pow = scanner.nextInt();
        }
        printTable(pow);
        scanner.close();
    }
}
