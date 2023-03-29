package com.devxschool;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MiddleOneTest {
    @Test
    public void test1PrintMiddleOne() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MiddleOne.printMiddleOne("oak");

        Assert.assertEquals("Should print one middle char",

                "a", out.toString().trim());
    }

    @Test
    public void test2PrintMiddleOne() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MiddleOne.printMiddleOne("devxshool");

        Assert.assertEquals("Should print one middle char",

                "s", out.toString().trim());
    }

    @Test
    public void test3PrintMiddleOne() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MiddleOne.printMiddleOne("Karakol");

        Assert.assertEquals("Should print one middle char",
                "a", out.toString().trim());
    }

    @Test
    public void test1PrintMiddleTwo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MiddleOne.printMiddleOne("java");

        Assert.assertEquals("Should print two middle chars",

                "av", out.toString().trim());
    }

    @Test
    public void test2PrintMiddleTwo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MiddleOne.printMiddleOne("apples");

        Assert.assertEquals("Should print two middle chars",

                "pl", out.toString().trim());
    }

    @Test
    public void test3PrintMiddleTwo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MiddleOne.printMiddleOne("SDET");

        Assert.assertEquals("Should print two middle chars",

                "DE", out.toString().trim());
    }

    @Test
    public void test1Print3Times() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MiddleOne.printMiddleOne("#");

        Assert.assertEquals("Should print three same chars",

                "###", out.toString().trim());
    }

    @Test
    public void test2Print3Times() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MiddleOne.printMiddleOne("X");

        Assert.assertEquals("Should print three same chars",

                "XXX", out.toString().trim());
    }

    @Test
    public void test1Print2Times() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MiddleOne.printMiddleOne("@@");

        Assert.assertEquals("Should print two same chars",

                "@@@@", out.toString().trim());
    }

    @Test
    public void test2Print2Times() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        MiddleOne.printMiddleOne("AA");

        Assert.assertEquals("Should print two same chars",

                "AAAA", out.toString().trim());
    }
}
