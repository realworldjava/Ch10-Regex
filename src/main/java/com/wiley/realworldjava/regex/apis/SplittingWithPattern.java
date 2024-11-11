package com.wiley.realworldjava.regex.apis;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class SplittingWithPattern {

    public static void main(String[] args) {
        String text = "- 123 - 456 - 789 -";
        Pattern pattern = Pattern.compile("[- ]+");
        Stream<String> stream = pattern.splitAsStream(text);
        stream.forEach (a -> System.out.println("*" + a + "*"));

    }
}
