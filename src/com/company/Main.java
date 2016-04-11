package com.company;

import com.sun.javaws.util.JavawsConsoleController;

import java.io.Console;
import java.io.Reader;
import java.util.Date;
import java.text.*;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String myName = "An";
        int age = 27;
        double height = 1.60;
        char atChar = '@';

        System.out.println("Hello, world!");
        System.out.println("My name is\t" + myName);
        System.out.println("My age is\t" + age);
        System.out.println("My height is\t" + height);

        int a = 4765432;
        int b = 897652458;
        int result = a + b;
        System.out.println("\n" + a + " + " + b + " = " + result);

        //  get current date and time using Date()
        Date currentDate = new Date();

        //  print current date using SimpleDateFormat (import java.text.*; needed)
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.y");
        System.out.println("\nCurrent date using SimpleDateFormat: " + ft.format(currentDate));

        //  print current date using printf()
        System.out.printf("%s %td.%<tm.%<tY", "Current date using printf():\t\t", currentDate);

        // print current date using Calendar
        Calendar dateNow = Calendar.getInstance();
        System.out.println("\nCurrent date using Calendar:\t\t " + ft.format(dateNow.getTime()));

        // print current date and time
        System.out.println("\nCurrent date and time:\t\t" + dateNow.getTime());
        dateNow.add(Calendar.HOUR_OF_DAY, 20);
        System.out.println("The date after 20 hours:\t" + dateNow.getTime());

        // print on the console the product of two “double” variables declared by you
        double applesWeight = 2.5;
        double applesPrice = 1.59;
        System.out.format("\n%1$.1f kg apples at %2$.2f lev/kg cost %3$.2f lev\n", applesWeight, applesPrice, applesWeight * applesPrice);

        // read from the console an user input which should be numeric. Sum it with 10 and print on the console the sum.
        Scanner console = new Scanner(System.in);

        System.out.println("\nPlease enter a number: ");
        double anyNumber = console.nextDouble();
        double sumOfNumbers = anyNumber + 10;
        System.out.println("The sum of the number plus 10 is " + sumOfNumbers);

        // 	read from the console two numbers. Print on the console their product (e.g. Read “4” and “20”, Print “80”)
        System.out.println("\nPlease enter a real number: ");
        double realNumber = console.nextDouble();
        System.out.println("Now enter an int number:");
        int integerNumber = console.nextInt();
        double productOfNumbers = realNumber * integerNumber;
        System.out.println("The product of the numbers is " + productOfNumbers);

        // print on the console the numbers from 1 to 1000

        System.out.println("\nPress ENTER to print the numbers from 1 to 1000: ");
        java.io.InputStreamReader reader = new java.io.InputStreamReader(System.in);
        boolean keyPressed = false;
        while(!keyPressed)
        {
            try{
                if ( reader.ready())
                {
                    keyPressed = true;
                }
            }
            catch (java.io.IOException ioex)
            {
                System.out.println("IO Exception");
            }

           try
            {
                Thread.sleep(50);
            }
            catch (InterruptedException ex)
            {
                System.out.println("Interrupted Exception");
            }
        }
        for (int i = 0; i < 1001; ++i) {
                System.out.println(i);
            }
    }
}