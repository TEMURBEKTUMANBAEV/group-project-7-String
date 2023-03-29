package com.devxschool;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CountCharsTest {
    @Test
    public void test1CountChars() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        CountChars.printCounts("NoWhiteSpaceString222");

        Assert.assertEquals("Calculation is wrong",
                "Vowels: 6\r\n" +
                        "Consonants: 12\r\n" +
                        "Digits: 3\r\n" +
                        "White spaces: 0\r\n" +
                        "Symbols : 0", out.toString().trim());
    }

    @Test
    public void test2CountChars() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        CountChars.printCounts("Three white spaces three***");

        Assert.assertEquals("Calculation is wrong",
                "Vowels: 8\r\n" +
                        "Consonants: 13\r\n" +
                        "Digits: 0\r\n" +
                        "White spaces: 3\r\n" +
                        "Symbols : 3", out.toString().trim());
    }

    @Test
    public void test3CountChars() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        CountChars.printCounts("WhiteSpaceAtTheEnd ");

        Assert.assertEquals("Calculation is wrong",
                "Vowels: 7\r\n" +
                        "Consonants: 11\r\n" +
                        "Digits: 0\r\n" +
                        "White spaces: 1\r\n" +
                        "Symbols : 0", out.toString().trim());
    }

    @Test
    public void test4CountChars() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        CountChars.printCounts("@!#@!$$!#%");

        Assert.assertEquals("Calculation is wrong",
                "Vowels: 0\r\n" +
                        "Consonants: 0\r\n" +
                        "Digits: 0\r\n" +
                        "White spaces: 0\r\n" +
                        "Symbols : 10", out.toString().trim());
    }

    @Test
    public void test5CountChars() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        CountChars.printCounts("09981631431");

        Assert.assertEquals("Calculation is wrong",
                "Vowels: 0\r\n" +
                        "Consonants: 0\r\n" +
                        "Digits: 11\r\n" +
                        "White spaces: 0\r\n" +
                        "Symbols : 0", out.toString().trim());
    }
}
