package com.wiley.realworldjava.regex.apis;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Flags {

    public static void main(String[] args) {
        dotAllCaseInsensitive();

        multiline();
    }

    private static void multiline() {
        String text = """
                Real-World Java: Helping You Navigate the Java Ecosystem
                Victor Grazi
                Jeanne Boyarsky""";
        Pattern pattern = Pattern.compile(".*[iy]$", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void dotAllCaseInsensitive() {
        String text = """
                Real-World Java: Helping You Navigate the Java Ecosystem
                Victor Grazi
                Jeanne Boyarsky""";
        Pattern pattern = Pattern.compile("real.*sky", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("I got this book!");
        } else {
            System.out.println("I should have gotten this book!");
        }



        if (text.matches("(?i)(?s)real.*sky")) {
            System.out.println("I got this book!");
        } else {
            System.out.println("I should have gotten this book!");
        }
    }
}
