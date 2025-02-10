package org.example;

import java.util.Scanner;

public class Task3 {
    static void evenOdd() {
        System.out.println("Enter the value of A: ");
        int a = new Scanner(System.in).nextInt();

        if (a % 2 == 0) {
            System.out.println("A is an Even number");
        } else {
            System.out.println("A is an Odd number");
        }
    }

    static void marksGrade(){
        System.out.println("Enter your marks : ");
        int a = new Scanner(System.in).nextInt();
        if (a>=60){
            if(a>=90 && a<=100){
                System.out.println("Grade: A");
            }
            else if (a>=80 && a<90){
                System.out.println("Grade: B");
            }
            else if (a>=70 && a<80){
                System.out.println("Grade: C");
            }
            else {
                System.out.println("Grade: D");
            }
        }
        else {
            System.out.println("Grade: F");
        }
    }

    public static void main(String[] args) {

        evenOdd();
        marksGrade();
    }
}

