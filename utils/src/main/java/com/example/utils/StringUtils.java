package com.example.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public boolean isPositiveNumber(String str) {

        if (!NumberUtils.isCreatable(str)) {
            return false;
        }
        return NumberUtils.createDouble(str) > 0;
    }
}
