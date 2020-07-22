package com.aayla;

import java.util.Scanner;

/*
   Program name: PACE
   Description: Divides a number by 5.4
   Author: Aayla Fetzer
   Date: 6/12/2020
   Version: 1.0
   Vocabulary word (non-computer related): Correspondence
   Inspirational quote and author (non-political, non-religious): "No." - William Shakespeare
*/


public class Main {
    public static int getInteger() {
        // Define integer and Scanner
        int x;
        Scanner scan = new Scanner(System.in);
        // Get the required inputs
        System.out.print("Please enter an integer: ");
        while (true) {
            if (!scan.hasNextInt()) {  // Test if the user has given an integer
                scan.nextLine();  // Don't make infinite loops
            } else {
                x = scan.nextInt();  // The user has given an integer
                break;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        // Declare variables
        String food;
        int calories;

        // Create Scanner
        Scanner scan = new Scanner(System.in);

        // Request input from the users
        System.out.print("What food item did you eat? ");
        food = scan.nextLine();
        System.out.print("How many calories did it have? ");
        calories = getInteger();

        // Calculate walking time to burn calories
        int walkingTime = (int) (calories / 5.4);

        // Display output to user
        System.out.println("It would take " + walkingTime + " minutes of walking to burn your " + calories + " calorie " + food + ".");
    }
}
