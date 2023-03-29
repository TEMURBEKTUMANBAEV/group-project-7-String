package com.devxschool;

import java.util.Scanner;
public class Concatenation {

    public static void main(String[] args) {
        /**
         * Write a function that concatenates two words into single,
         * however if the concatenation creates a similar double char, then omit one of the character's
         * ex:
         * "abc" "cat" -> "abcat"
         *
         * ex2:
         * "abc", "xyz" -> "abcxyz"
         *
         * ex3:
         * "happy", "yolk" -> happyolk
         */

        //TODO WRITE YOUR CODE HERE
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = sc.nextLine();
        System.out.print("Enter the second word: ");
        String word2 = sc.nextLine();

        String result = concat(word1, word2);
        System.out.println("Result: " + result);
    }

    public static String concat(String word1, String word2) {
        // TODO IMPLEMENT METHOD
        int n = word1.length();
        int m = word2.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(word1.charAt(i));
            if (i < n - 1 && word1.charAt(i + 1) == word2.charAt(0)) {
                break;
            }
        }

        sb.append(word2);
        return sb.toString();
    }
}
