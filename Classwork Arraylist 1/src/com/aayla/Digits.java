package com.aayla;

import java.util.*;

public class Digits
{
    /** A list of digits */
    private ArrayList<Integer> digitList;

    /** Constructs a list of digits from the given number */
    public Digits(int number)
    {
        // initialize digitList to an empty ArrayList of Integers
        ArrayList<Integer> digitList = new ArrayList<>();
        // Use a while loop to add each digit in number to digitList
        while (true) {
            digitList.add(number % 10);
            number /= 10;
            if (number == 0) {
                break;
            }
        }
        //Use Collections.reverse(digitList); to reverse the digits
        Collections.reverse(digitList);
        this.digitList = digitList;
    }

    /** returns the string representation of the digits list */
    public String toString()
    {
        return digitList.toString();
    }

    public static void main(String[] args)
    {
        Digits d1 = new Digits(154);
        System.out.println(d1);
    }
}
