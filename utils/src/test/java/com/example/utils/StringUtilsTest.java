package com.example.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    StringUtils stringUtils = new StringUtils();

    @Test
    void isPositiveNumber() {
        assertTrue(stringUtils.isPositiveNumber("23"));
        assertFalse(stringUtils.isPositiveNumber("-2374"));
    }
    @Test
    public void negative() {
        assertThrows(NumberFormatException.class,()->stringUtils.isPositiveNumber("dlkfjglkdfjg345"));
    }
}