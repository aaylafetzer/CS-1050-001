package com.afetzer;

import java.util.ArrayList;
import java.util.Arrays;

class Pixel {
    ArrayList<Integer> values = new ArrayList<>();
    public Pixel(Integer[] RGB) {
        this.values.addAll(Arrays.asList(RGB));
    }
    public void makeLighter() {
        ArrayList<Integer> newValues = new ArrayList<>();
        this.values.forEach((Integer value) -> newValues.add(
                Math.min(255, value + 60)  // Unsigned 8 bit values cannot exceed 255
        ));
        this.values = newValues;
    }
    public String toString() {
        return values.toString();
    }
}

public class Main {

    public static void main(String[] args) {
        // Create 10 Pixels
        ArrayList<Pixel> pixels = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            pixels.add(new Pixel(new Integer[]{50, 100, 150}));
        }
        System.out.println(pixels);
        // Brighten the 2D Array
        pixels.forEach(Pixel::makeLighter);
        // Print new values
        System.out.println(pixels);
    }
}
