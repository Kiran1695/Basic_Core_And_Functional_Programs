package com.bridgelabz.basiccoreprogram;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        float first = 20.0f, second = 24.5f;
        System.out.println("Before Swap");
        System.out.println(" First Number => " + first);
        System.out.println("Second Number => " + second);
        first = first - second;
        second = first + second;
        first = second - first;
        System.out.println("After Swap");
        System.out.println("First Number => " + first);
        System.out.println("Second Number => " + second);
    }
}
