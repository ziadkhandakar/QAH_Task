package org.example;

import java.util.Scanner;

public class Task4 {

    static int i=1;
    static int sum=0;
    static Scanner scanner = new Scanner(System.in);

    //4.4- Reverse Digits using while loop
    static void reverseNum() {

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            reversed = reversed * 10 + digit; // Add the last digit to reversed number
            number =number/ 10; // Remove the last digit from number
        }

        System.out.println("Reversed Number: " + reversed);

    }
    //4.5- Calculate the sum of digits
    static void sumDigits(){
        //int sum= 0;
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        while (number != 0) {
            sum = sum + number % 10;
            number =number / 10;
        }
        System.out.println("Sum of digits = " + sum);
    }


    public static void main(String[] args) {
        //int i = 1, sum = 0;
        //1 to 20
        System.out.println("***4.1: Print 1 to 20*** ");
        for (i = 1; i <= 20; i++) {
            System.out.println(i);
        }
        //Even Number between 1 to 50
        System.out.println("***4.2: Print Even number only between 1 to 50*** ");
        for (i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            else{
                continue;
            }
        }
        //DoWhile loop
        System.out.println("***4.3: sum of all numbers from 1 to 100*** ");
        do {
             sum =sum +i;
             i =i+1;
        }
        while(i<=100);
        System.out.println(sum);

        System.out.println("***4.4: Reverese digits of the entered number*** ");
     reverseNum();
        System.out.println("***4.5: calculates the sum of its digits*** ");
     sumDigits();

    }
}
