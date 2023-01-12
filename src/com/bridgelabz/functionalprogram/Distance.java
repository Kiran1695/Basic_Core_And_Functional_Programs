package com.bridgelabz.functionalprogram;

import java.util.Scanner;

public class Distance {
    static void calculate(int x, int y) {
        System.out.println("Distance is " + Math.pow((x * x + y * y), 0.5));
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Value for X");
            int x = scanner.nextInt();
            System.out.println("Enter value for Y");
            int y = scanner.nextInt();
            calculate(x, y);
            scanner.close();
        } catch (Exception e) {
            System.out.println("Enter Integer Only");
        }
    }
}
