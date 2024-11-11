package com.wiley.realworldjava.regex.escaping;

public class Escaping {

    public static void main(String[] args) {
        String escapeQuote = "\"Java is Great\"";
        System.out.println(escapeQuote);

        String escapeBackslash = "\\";
        String escapeBackslashForRegex = "\\\\";
        System.out.println(escapeBackslash);
        System.out.println("\\".matches(escapeBackslashForRegex));

        String addition = "\\d \\+ \\d";
        System.out.println(addition);
        System.out.println("1 + 2".matches(addition));

        String escapePeriod1 = "[.]";
        String escapePeriod2 = "\\.";
        System.out.println(".".matches(escapePeriod1));
        System.out.println(".".matches(escapePeriod2));

    }
}