package org.example;

import java.util.Scanner;

public class Task4 {
    //Reverse Digits using while loop
    static void reverseNum() {
        Scanner scanner = new Scanner(System.in); // Create Scanner object


        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the number

        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            reversed = reversed * 10 + digit; // Add the last digit to reversed number
            number /= 10; // Remove the last digit from number
        }

        System.out.println("Reversed Number: " + reversed);

    }


    public static void main(String[] args) {
        int i = 1, sum = 0;
        /*//1 to 20
        for (i = 1; i <= 20; i++) {
            System.out.println(i);
        }
        //Even Number between 1 to 50
        for (i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            else{
                continue;
            }
        }
        //DoWhile loop
        do {
             sum =sum +i;
             i =i+1;
        }
        while(i<=100);
        System.out.println(sum);
        }*/
    reverseNum();

    }
}
