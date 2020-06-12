package com.aayla;

import java.util.Scanner;

public class Main {
    public static int getInteger() {
        // Define integer and Scanner
        int x;
        Scanner scan = new Scanner(System.in);
        // Get the required inputs
        System.out.print("Please enter an integer: ");
        while (true) {
            if (!scan.hasNextInt()) {
                System.out.print("Please enter a valid integer: ");  // The user has given something else because they are evil
                scan.nextLine();  // Don't make infinite loops
            } else {
                x = scan.nextInt();  // The user has given an integer
                break;
            }
        }
        return x;
    }
    public static void main(String[] args) {
//	    Get user inputs
        int n0 = getInteger();
        int n1 = getInteger();
        // Just using inline math because I'm lazy
        System.out.println("The sum of these two numbers is: " + (n0 + n1));
        System.out.println("The product of these two numbers is: " + (n0 * n1));
    }
}
