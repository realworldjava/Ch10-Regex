package com.wiley.realworldjava.regex.apis;

import java.util.Arrays;

public class SplittingWithString {

    public static void main(String[] args) {
        space();

        regex();

        matchEveryBoundary();

        matchBeginningAndEnd();

        withLimit();

        withDelimiter();
    }

    private static void withDelimiter() {
        String text = "- 123 - 456 - 789 -";
        String[] limit3 = text.splitWithDelimiters("[- ]+", 3);
        System.out.println(limit3.length); // 3
        System.out.println(Arrays.asList(limit3)); // [, - , 123 - 456 - 789 -]
    }

    private static void withLimit() {
        String text = "- 123 - 456 - 789 -";
        String[] limit0 = text.split("[- ]+", 0);
        System.out.println(limit0.length); // 4
        System.out.println(Arrays.asList(limit0)); // [, 123, 456, 789]

        String[] limit3 = text.split("[- ]+", 3);
        System.out.println(limit3.length); // 3
        System.out.println(Arrays.asList(limit3)); // [, 123 - 456 - 789 -]

        String[] limitNegative = text.split("[- ]+", -1);
        System.out.println(limitNegative.length); // 5
        System.out.println(Arrays.asList(limitNegative)); // [, 123, 456, 789, ]


    }

    private static void matchBeginningAndEnd() {
        String text = "- 123 - 456 - 789 -";
        String[] words = text.split("[- ]+");
        System.out.println(words.length); // 4
        System.out.println(Arrays.asList(words)); // [, 123, 456, 789]
    }

    private static void matchEveryBoundary() {
        String text = "123 - 456 - 789";
        String[] words = text.split("[- ]*");
        System.out.println(words.length); // 11
        System.out.println(Arrays.asList(words)); // [1, 2, 3, , 4, 5, 6, , 7, 8, 9]
    }

    private static void regex() {
        String text = "123 - 456 - 789";
        String[] words = text.split("[- ]+");
        System.out.println(words.length); // 3
        System.out.println(Arrays.asList(words)); // [123, 456, 789]
    }

    private static void space() {
        String text = "123";
        String[] words = text.split(" ");
        System.out.println(words.length); // 2
        System.out.println(Arrays.asList(words)); // [java, book]
    }
}
