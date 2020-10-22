package org.example.controller;

import org.example.service.Utils;

public class App {
    public static void main(String[] args) {
        Utils utils = new Utils();
        System.out.println("utils.isAllPositiveNumbers(\"23\",\"23\") = " + utils.isAllPositiveNumbers("23", "23"));
    }
}
