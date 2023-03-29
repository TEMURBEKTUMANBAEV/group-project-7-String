package com.devxschool;

import java.util.Scanner;

public class CountChars {

    public static void main(String[] args) {
        /**
         * Write a program to count number of vowels, consonants,
         * digits, special characters and whitespaces in the string
         *
         * Ex 1:
         *
         * Enter the string : This program is very easy
         * Vowels: 7
         * Consonants: 14
         * Digits: 0
         * White spaces: 4
         * Symbols : 0
         *
         * Ex 2:
         *
         * Enter the string : 123 this very ^^
         * Vowels: 2
         * Consonants: 6
         * Digits: 3
         * White spaces: 3
         * Symbols : 2
         */

        String line;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        line = sc.nextLine();
        printCounts(line);
    }

    public static void printCounts(String word) {
        // TODO IMPLEMENT METHOD
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        int symbols = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            } else {
                symbols++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("White spaces: " + spaces);
        System.out.println("Symbols : " + symbols);
    }
}
