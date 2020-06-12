package com.aayla;

public class Main {

    public static void main(String[] args) {
        // Declare and define variables
        int n0 = (int) (Math.random() * 10);
        int n1 = (int) (Math.random() * 10);
        int n2 = (int) (Math.random() * 10);
        int max;
        double average;

//      Print inputs to console
        System.out.println("n0: " + n0 + ", n1: " + n1 + ", n2: " + n2);

/*
        Find the largest of 3 numbers
        This is how I would do it normally, if this assignment wasn't about using if statements.
        max = Math.max(Math.max(n0, n1), n2);

        While not the method used in the course, this method will work as well and is also more scalable in the event that
        a comparison between more numbers is needed. Because Java executes code sequentially, this method is comparable
        to iterating through an array of integers in order to find the largest number. By only redefining "max" as n(x) if
        n(x) is bigger than the current value of "max," once the end of the comparisons is reached the value of "max" must
        be equal to the value of the highest n(x) value it was compared to.
 */

        max = n0;
        if (n1 >= max) {
            max = n1;
        }
        if (n2 >= max) {
            max = n2;
        }

//      Calculate the average of the 3 numbers with basic math
        average = (n0 + n1 + n2) / 3;

//      Print results to console
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + average);
    }
}
