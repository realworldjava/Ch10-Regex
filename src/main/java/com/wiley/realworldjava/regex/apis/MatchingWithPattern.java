package com.wiley.realworldjava.regex.apis;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingWithPattern {

    public static void main(String[] args) {
        loop();
        numberedGroups();
        namedGroups();
    }

    private static void namedGroups() {
        String text = "Real World Java";
        Pattern pattern = Pattern.compile("(?<first>\\w)(?<second>\\w)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String chars = "%s %s".formatted(matcher.group("first"), matcher.group("second"));
            System.out.println(chars);
        }
    }

    private static void numberedGroups() {
        String twoAdjacentWordChars = "(\\w)(\\w)";
        String text = "Real World Java";
        Pattern pattern = Pattern.compile("(\\w)(\\w)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String chars = "%s %s".formatted(matcher.group(1), matcher.group(2));
            System.out.println(chars);
        }
    }

    private static void loop() {
        String text = "java book";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
