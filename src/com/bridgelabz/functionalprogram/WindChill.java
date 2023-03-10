package com.bridgelabz.functionalprogram;

import java.util.Scanner;

public class WindChill {
    static void windChill(double f, double ws) {
        double w = 35.74 + 0.62158 * f + (0.4275 * f - 35.75) * Math.pow(ws, 0.16);
        System.out.println(w);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter temperature in Fahrenheit");
            double f = scanner.nextDouble();
            System.out.println("Enter wind speed in mile per hour");
            double ws = scanner.nextDouble();
            if (Math.abs(f) > 50 || ws > 120 || ws < 3) {
                System.out.println("Enter correct input");
            } else {
                windChill(f, ws);
            }
        }catch (Exception e){
            System.out.println("Enter proper input");
        }
        scanner.close();
    }
}
