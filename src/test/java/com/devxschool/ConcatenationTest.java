package com.devxschool;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConcatenationTest {
    @Test
    public void test1ConcatenationOmits() {
        String actual = Concatenation.concat("abc", "cat");
        assertEquals("Concatenation should omit one char", "abcat", actual);
    }

    @Test
    public void test2ConcatenationOmits() {
        String actual = Concatenation.concat("happy", "yolk");
        assertEquals("Concatenation should omit one char", "happyolk", actual);
    }

    @Test
    public void test1Concatenation() {
        String actual = Concatenation.concat("abc", "xyz");
        assertEquals("Concatenation should omit one char", "abcxyz", actual);
    }

    @Test
    public void test2Concatenation() {
        String actual = Concatenation.concat("happy", "man");
        assertEquals("Concatenation should omit one char", "happyman", actual);
    }
}
