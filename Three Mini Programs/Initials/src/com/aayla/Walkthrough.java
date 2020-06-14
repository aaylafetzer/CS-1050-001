package com.aayla;

import java.util.Scanner;  // Import the Java Scanner object, which we will use to read user inputs from the console.

/*
   Program name: Initials Walkthrough
   Description: Shows students how to create the Initials program
   Author: Aayla Fetzer
   Date: 6/12/2020
   Version: 1.0
   Vocabulary word (non-computer related): Separate
   Inspirational quote and author (non-political, non-religious): "Never call it an opportunity. Call it imprisonment" - Inspirobot
*/

public class Walkthrough {
    public static void main(String[] args) {
        /*
            The purpose of this program is to print someone's initials given their first, middle, and last names. Breaking
            this process down into logical steps means that we have to do 3 things:

            Step 1: Take the user's first, middle, and last names as input.
            Step 2: Gather the user's initials from the given inputs.
            Step 3: Print the initials to the console.

            To accomplish these goals, we will do step one by creating a Scanner object and asking for the user's names, storing
            them in variables. Next, we will use the charAt() function, which is built in to the Java String type, to find the
            first character of each part of the name. Finally, we will combine the initials together in a final String which we
            will print to the console.
         */

        // Here we declare our input variables. We will assign values later.
        String firstName;
        String middleName;
        String lastName;

        /*
            Step 1: Take the user's first, middle, and last names as input.

            For this step, we will use something called a "Scanner." The official Java documentation describes a Scanner as:

            "A simple text scanner which can parse primitive types and strings using regular expressions."

            The first step to using one of these Scanners is to create it like any other object. Notice "System.in" being
            passed to the new Scanner as an argument. You may recognize this as being similar to the "System.out" we've used
            previously to print text to the console. Your first instincts about this are correct, and "System.in" is used in
            handling console inputs, compared to System.out's console outputs.
         */

        Scanner scan = new Scanner(System.in);  // Create a new Scanner object. Notice the System.in argument.

        /*
            Next, we will use this Scanner to read the user's first, middle, and last names into the Strings we declared
            earlier. Notice that we are using print instead of println to allow the user to enter their first name into
            the same line as the request. Notice also the whitespace after the colon in the string asking for their name.
            This is so there is visual separation between the request and what the user inputs. It makes no technical
            difference. Because the user will press Enter to finish their input, there is no need for the code to make a
            new line.
         */
        System.out.print("Please enter your first name: ");
        firstName = scan.nextLine();  // Use Scanner.nextLine() to read everything the user has input.
        System.out.print("Please enter your middle name: ");
        middleName = scan.nextLine();
        System.out.print("Please enter your last name: ");
        lastName = scan.nextLine();

        /*
            Step 2: Gather the user's initials from the given inputs.

            Now that we have gathered the user's first, middle, and last name in distinct strings, it's time to use those
            strings to determine the user's initials. To do this, we'll be using the charAt() function built in to the Java
            String type. Java, like most programming languages, starts counting at zero. Therefore, to get the first character
            in a string, we will be getting the character at index 0.
        */
        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        /*
            Step 3: Print the initials to the console.

            Now that we have gathered the user's first, middle, and last names and used that information to determine their
            initials, all that's left to do is print the initials to the console with familiar System.out functions. Notice
            The ". " being added to the initials. This is a purely aesthetic addition and does not make a technical difference.
         */

        System.out.println("Your initials are: " + firstInitial + ". " +
                middleInitial + ". " +
                lastInitial + ".");
    }
}
