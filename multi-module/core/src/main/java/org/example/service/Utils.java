package org.example.service;


import com.example.utils.StringUtils;

public class Utils {
    private StringUtils stringUtils = new StringUtils();


    public boolean isAllPositiveNumbers(String... str) {
        if (str == null || str.length == 0) {
            return false;
        }

        return helper(str);
    }

    private boolean helper(String[] str) {
        boolean result = true;
        for (String s : str) {
            result = result && stringUtils.isPositiveNumber(s);
        }
        return result;
    }
}
