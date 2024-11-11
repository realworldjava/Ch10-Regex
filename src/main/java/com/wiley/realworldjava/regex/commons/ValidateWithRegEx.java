package com.wiley.realworldjava.regex.commons;

import org.apache.commons.validator.routines.RegexValidator;

public class ValidateWithRegEx {

    public static void main(String[] args) {

        String regex = "^\\d{4}$"; // match 4 consecutive digits
        RegexValidator validator = new RegexValidator(regex);
        System.out.println(validator.isValid("2034")); // true
        System.out.println(validator.isValid("5")); // false
    }
}
