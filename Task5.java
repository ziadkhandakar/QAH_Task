package org.example;

import java.util.Scanner;

public class Task5 {
    //5.1: Welcome message
    static void welcome()
    {
        System.out.println("Welcome to my task no-5");
    }

    //5.2 method returns the sum
    static int sum(int a, int b)
    {
        return a+b;

    }

    //5.3: isEven method
    static boolean isEven(int num)
    {
        return num%2==0;

    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***Welcome Message***");
        welcome();

        System.out.println("***Two integer input to return their sum***");

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Sum: " + sum(a,b));

        System.out.println("***Enter a number to check even number***");
        int num = scanner.nextInt();
        System.out.println("The given number is Even: " + isEven(num));

    }
}
