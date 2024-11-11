package com.wiley.realworldjava.regex.apis;

public class MatchingWithString {

    public static void main(String[] args) {
        String text = "java book";
        System.out.println(text.matches("[aeiou]")); // false
        System.out.println(text.matches(".*[aeiou].*"));  // true
        System.out.println(text.matches("^.*[aeiou].*$")); // true
        System.out.println(text.matches("\\w+\\s\\w+")); // true

        String word = "\\w+";
        String space = "\\s";
        String regex = word + space + word;
        System.out.println(text.matches(regex)); // true
    }
}
