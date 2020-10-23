package com.example.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    private StringUtils stringUtils = new StringUtils();

    @Test
    void testPositiveNumberTrue() {
        assertTrue(stringUtils.isPositiveNumber("23"));
    }

    @Test
    public void testNegativeNumberFalse() {
        assertFalse(stringUtils.isPositiveNumber("-2374"));
    }

}