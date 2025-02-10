package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task1 {
    public static void main(String[] args) {
        byte byteValue= 127;
        short shortValue= 3000;
        int intValue= 100000;
        long longValue= 1000000;
        float floatValue= 100.1f;
        double doubleValue= 105.4567;
        char charValue= 'B';
        String stringValue= "This is my first Java program";
        boolean booleanValue= true;
        //Declaring Array variable
        int[] arrayIntValue= {10,12,30,5};
        String[] arrayStringValue= {"Hello","QA Harbor"};

//Primitive Identifier print

        System.out.println("The byte value is " + byteValue);
        System.out.println("The short value is " + shortValue);
        System.out.println("The int value is " + intValue);
        System.out.println("The long value is " + longValue);
        System.out.println("The float value is " + floatValue);
        System.out.println("The double value is " + doubleValue);
        System.out.println("The Char value is " + charValue);
        System.out.println("The string value is " + stringValue);
        System.out.println("The Boolean value is " + booleanValue);
//Array print
        System.out.println("The Int Array value is " + arrayIntValue[0]);
        System.out.println("The String Array value is " + arrayStringValue[1]);



    }
}
