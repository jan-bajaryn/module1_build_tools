package com.example.utils;

import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigInteger;

public class StringUtils {
    public boolean isPositiveNumber(String str) {
        return NumberUtils.createBigInteger(str).compareTo(BigInteger.ZERO) > 0;
    }
}
