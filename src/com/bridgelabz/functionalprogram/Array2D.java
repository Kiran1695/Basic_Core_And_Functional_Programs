package com.bridgelabz.functionalprogram;

import java.io.PrintWriter;
import java.util.Scanner;

public class Array2D {
    static Scanner scanner = new Scanner(System.in);

    public static int[][] arrayInt(int m, int n) {
        int a[][] = new int[m][n];
        System.out.println();
        System.out.println("integer array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        return a;
    }

    public static double[][] arrayDouble(int m, int n) {
        double b[][] = new double[m][n];
        System.out.println();
        System.out.println("Double Array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = scanner.nextDouble();
            }
        }
        return b;
    }

    public static String[][] arrayBoolean(int m, int n) {
        String c[][] = new String[m][n];
        System.out.println();
        System.out.println("Boolean Array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = scanner.nextLine();
            }
        }
        return c;
    }

    public static void display(int[][] a, double[][] b, String[][] c, int m, int n) {
        PrintWriter printWriter = new PrintWriter(System.out, true);
        System.out.println();
        printWriter.println("2D ARRAY INTEGER");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                printWriter.print("\t" + a[i][j] + " ");
            }
            printWriter.println("\t");
        }
        System.out.println();
        printWriter.println("2D ARRAY DOUBLE");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                printWriter.print("\t" + b[i][j] + " ");
            }
            printWriter.println("\t");
        }
        System.out.println();
        printWriter.println("2D ARRAY BOOLEAN");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                printWriter.print("\t" + c[i][j] + " ");
            }
            printWriter.println("\t");
        }
    }

    <t> void displayArray(t[][] arr) {
        PrintWriter printWriter = new PrintWriter(System.out);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                printWriter.print("\t" + arr[i][j] + " ");
            }
            printWriter.println("\t");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter no. of rows=> ");
        int m = scanner.nextInt();
        System.out.println("Enter no. of columns=> ");
        int n = scanner.nextInt();
        int[][] a = arrayInt(m, n);
        double[][] b = arrayDouble(m, n);
        String[][] c = arrayBoolean(m, n);
        display(a, b, c, m, n);
    }
}
