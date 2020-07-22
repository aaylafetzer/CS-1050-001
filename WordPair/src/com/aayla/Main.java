package com.aayla;

/*
    I couldn't find the example code we were supposed to work with, so I recreated the functionality on my own. I hope
      that's ok -Aayla
 */

import java.util.ArrayList;

class WordPair {
    private final String word1;
    private final String word2;
    String getWord1() { return word1; }
    String getWord2() { return word2; }

    public String toString() { return "(" + word1 + ", " + word2 + ")"; }
    public WordPair(String w1, String w2) { word1 = w1; word2 = w2;}
}

class WordPairsList {
    ArrayList<WordPair> list = new ArrayList<WordPair>();
    void add(WordPair newPair) {
        list.add(newPair);
    }
    void printAll() {
        for (WordPair pair : list) {
            System.out.print(pair.toString());
            System.out.print(", ");
        }
        System.out.print("\n");
    }
    public int numMatches() {
        int count = 0;
        for (WordPair pair : list) {
            if (pair.getWord1().equals(pair.getWord2())) { count++; }
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        WordPairsList allPairs = new WordPairsList();
        allPairs.add(new WordPair("Hello", "There"));
        allPairs.add(new WordPair("General", "Kenobi"));
        allPairs.add(new WordPair("Hello", "Hello"));
        allPairs.add(new WordPair("General", "General"));
        allPairs.printAll();
        System.out.println("There were " + allPairs.numMatches() + " matches.");
    }
}
