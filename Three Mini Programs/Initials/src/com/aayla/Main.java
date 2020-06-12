package com.aayla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define input variables
        String firstName = "";
        String middleName = "";
        String lastName = "";
        // Create new Scanner object
        Scanner scan = new Scanner(System.in);

        /*
        This assigment makes many VERY UNSAFE assumptions about people and their names. I do not have a middle name, but
        that's almost the least severe issue you would come across making a system like this for people to use in the real
        world. You should not assume ANYTHING about someone's name, even how many they have or if they are case (in)sensitive.

        If you want more information about how complicated names outside of the English-speaking world are, I recommend
        starting with the famous blog post by Patrick McKenzie from 2010 called "Falsehoods Programmers Believe About
        Names" and Tom Scott's Computerphile YouTube video about Internationalization, both of which are linked below.

        Falsehoods Programmers Believe About Names: https://www.kalzumeus.com/2010/06/17/falsehoods-programmers-believe-about-names/
        Internationalis(z)ing Code - Computerphile: https://www.youtube.com/watch?v=0j74jcxSunY
         */

        // Get information from users
        System.out.print("Please enter your first name: ");
        firstName = scan.nextLine();
        System.out.print("Please enter your middle name. Leave blank if you don't have one: ");
        middleName = scan.nextLine();
        System.out.print("Please enter your last name: ");
        lastName = scan.nextLine();

        // Break the initials out of the user's name
        System.out.print("Your initials are: ");
        System.out.print(firstName.charAt(0) + ". ");
        if (!middleName.equals("")) {
            System.out.print(middleName.charAt(0) + ". ");
        }
        System.out.print(lastName.charAt(0) + ". ");
    }
}
