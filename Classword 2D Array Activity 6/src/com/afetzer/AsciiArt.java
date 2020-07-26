package com.afetzer;

public class AsciiArt {

    public static void main(String[] args) {
        String[][] asciiArt = {
                {" ", " ", "_", "_", "_", " ", " "},
                {" ", "(", "o", " ", "o", ")", " "},
                {"(", " ", " ", "V", " ", " ", ")"},
                {" ", "-", "m", "-", "m", "-", " "},
        };

        //Part 1: Add 2 assignment statements to change "o" to "@"
        for (int i = 0; i < asciiArt[1].length; i++) {
            if (asciiArt[1][i].equals("o")) {
                asciiArt[1][i] = "@";
            }
        }

        // print the asciiArt for Part 1
        System.out.println("ASCII Art:");
        for (String[] row : asciiArt) {
            for (String column : row)
                System.out.print(column);
            System.out.println();
        }

        //Part 2: Create your own ASCII art array and print it out!
        String art = "                    _                                                         _     _       _                     _       _   _    \n" +
                "     /\\            | |                                                       | |   | |     (_)                   (_)     | | | |   \n" +
                "    /  \\     _ __  | |_      ___    _ __     ___    ___    _ __ ___     ___  | |_  | |__    _   _ __     __ _     _    __| | | | __\n" +
                "   / /\\ \\   | '__| | __|    / _ \\  | '__|   / __|  / _ \\  | '_ ` _ \\   / _ \\ | __| | '_ \\  | | | '_ \\   / _` |   | |  / _` | | |/ /\n" +
                "  / ____ \\  | |    | |_    | (_) | | |      \\__ \\ | (_) | | | | | | | |  __/ | |_  | | | | | | | | | | | (_| |   | | | (_| | |   < \n" +
                " /_/    \\_\\ |_|     \\__|    \\___/  |_|      |___/  \\___/  |_| |_| |_|  \\___|  \\__| |_| |_| |_| |_| |_|  \\__, |   |_|  \\__,_| |_|\\_\\\n" +
                "                                                                                                         __/ |                     \n" +
                "                                                                                                        |___/                      ";
        for (char i : art.toCharArray()) {
            System.out.print(i);
        }
    }
}
