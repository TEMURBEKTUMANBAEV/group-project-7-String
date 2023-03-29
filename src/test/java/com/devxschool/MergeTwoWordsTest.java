package com.devxschool;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MergeTwoWordsTest {
    @Test
    public void test1MergeTwoWords() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MergeTwoWords.printMerge("ice", "sea");

        Assert.assertEquals("Should print merged two words one by one",
                "Incorrect input! Cannot merge", out.toString().trim());

    }

    @Test
    public void test2MergeTwoWords() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MergeTwoWords.printMerge("Hot", "Day");

        Assert.assertEquals("Should print merged two words one by one",
                "Incorrect input! Cannot merge", out.toString().trim());

    }

    @Test
    public void test1Negative() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MergeTwoWords.printMerge("hot", "girl");

        Assert.assertEquals("Should print error message if word doesn't consist 3 characters",

                "Incorrect input! Cannot merge", out.toString().trim());

    }

    @Test
    public void test2Negative() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MergeTwoWords.printMerge("Wife", "pan");

        Assert.assertEquals("Should print error message if word doesn't consist 3 characters",
                "Incorrect input! Cannot merge", out.toString().trim());

    }

    @Test
    public void test3Negative() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MergeTwoWords.printMerge("xo", "xo");

        Assert.assertEquals("Should print error message if word doesn't consist 3 characters",

                "Incorrect input! Cannot merge", out.toString().trim());

    }
}
