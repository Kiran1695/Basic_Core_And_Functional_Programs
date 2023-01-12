package com.bridgelabz.basiccoreprogram;

import java.util.Scanner;

public class Factors {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void primeFactor(int n) {
        for (int i = 2; i <= n; i++) {
            int t = n % i;
            if (t == 0) {
                if (isPrime(i)) ;
                System.out.println(i + "");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no to find find prime factor");
        int n = scanner.nextInt();
        System.out.println("Prime factors are ");
        primeFactor(n);
        scanner.close();
    }
}
