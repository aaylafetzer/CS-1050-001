package com.aayla;

import java.util.Scanner;  // Import the Java Scanner object, which we will use to read user inputs from the console.

/*
   Program name: Numbers Walkthrough
   Description: Teach students how to make the numbers program
   Author: Aayla Fetzer
   Date: 6/13/2020
   Version: 1.0
*/

public class Walkthrough {
    public static void main(String[] args) {
        /*
            The purpose of this program is to take two numbers provided by the user and print their sum and product to
            the console. This is a simple program that can be done in two steps:

            Step 1: Take the two numbers as user input.
            Step 2: Calculate and print the sum and product.

            To accomplish these steps, we will use a Java Scanner object and basic arithmetic.
         */

        // Here we will declare our input variables. We will assign the values later.
        int n0;
        int n1;

        /*
            Step 1: Take the two numbers as user input.

            For this step, we will use something called a "Scanner." For more information about Scanners, see the walkthrough
            for the "Initials" program linked below. However, rather than use Scanner.nextLine(), we will use Scanner.nextInt()
            as we are asking the user for integers as an input rather than a string.

            https://gitlab.com/afetzer/cs-1050-001/-/blob/master/Three%20Mini%20Programs/Initials/src/com/aayla/Walkthrough.java
        */
        Scanner scan = new Scanner(System.in);  // Create a new Scanner to read user input
        System.out.print("First number: ");
        n0 = scan.nextInt();
        System.out.print("Second number: ");
        n1 = scan.nextInt();

        /*
            Step 2: Calculate and print the sum and product.

            This step is simple, as we will just be using basic arithmetic and familiar System.out functions to do this.
            However, it is important to note when printing the product that programmers use an asterisk when multiplying.
         */
        System.out.println("Sum: " + (n0 + n1));  // Print the sum of the two numbers.
        System.out.println("Sum: " + (n0 * n1));  // Print the product of the two numbers. Notice the asterisk.
    }
}
