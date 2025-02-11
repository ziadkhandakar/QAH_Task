package org.example;

import java.util.Scanner;

public class Task6 {
    //Method Overloading
    static int multiply(int a, int b) {
        return a * b;
    }

    static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    static double multiply(double x, double y) {
        return x * y;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***Method Overloading***");
        System.out.println(" ");
        System.out.println("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.println("Enter second integer: ");
        int b = scanner.nextInt();
        System.out.println("Multiply of two integers: " + multiply(a, b));


        System.out.println("Enter third integer: ");
        int c = scanner.nextInt();
        System.out.println("Multiply of three integers: " + multiply(a, b, c));


        System.out.println("Enter first double: ");
        double x = scanner.nextDouble();
        System.out.println("Enter second double: ");
        double y = scanner.nextDouble();
        System.out.println("Multiply of two doubles: " + multiply(x, y));
    }
}
