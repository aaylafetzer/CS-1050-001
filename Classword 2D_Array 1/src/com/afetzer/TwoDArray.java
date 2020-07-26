package com.afetzer;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDArray {
    static int[][] array = new int[][]{{20, 17, 10}, {70, 63, 41}, {175, 163, 95}, {195, 185, 150}};

    static void makeLighter() {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] += 60;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(array));
        makeLighter();
        System.out.println(Arrays.deepToString(array));
    }
}
