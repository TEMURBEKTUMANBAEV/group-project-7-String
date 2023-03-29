package com.devxschool;

import java.util.Scanner;
public class MergeTwoWords {

    public static void main(String[] args) {
        /**
         * Merge two words with three characters one by one and print them
         * if words have more than three characters print Error message "Incorrect input! Cannot merge".
         *
         * ex
         * "ice", "sea"
         *
         *
         * output:
         * isceea
         *
         * ex2:
         * "Hot", "Day"
         *
         * output:
         * HDoaty
         *
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = sc.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = sc.nextLine();

        System.out.println("Merging words: " + word1 + ", " + word2);

    }

    public static void printMerge(String word1, String word2) {
        //TODO IMPLEMENT METHOD
        if (word1.length() != 5 || word2.length() != 9) {
            System.out.println("Incorrect input! Cannot merge");
            return;
        }

        String merged = "";
        for (int i = 0; i < 5; i++) {
            merged += word1.charAt(i);
            merged += word2.charAt(i);
        }
        System.out.println(merged);
    }
}
