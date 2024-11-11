package com.wiley.realworldjava.regex.apis;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplacingWithPattern {

    public static void main(String[] args) {
        replacing();
        replacingWithBackReferencesAndEscapes();
        quoteReplacement();
    }

    private static void quoteReplacement() {
        String text = "java book";
        StringBuffer buffer = new StringBuffer();
        Pattern pattern = Pattern.compile("(\\w)(\\w)(\\w)(\\w)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            // include a literal \ and $
            String replacement = Matcher.quoteReplacement("\\$1.00");
            matcher.appendReplacement(buffer, replacement);
        }
        matcher.appendTail(buffer);
        System.out.println(buffer);
    }

    private static void replacingWithBackReferencesAndEscapes() {
        String text = "java book";
        StringBuffer buffer = new StringBuffer();
        Pattern pattern = Pattern.compile("(\\w)(\\w)(\\w)(\\w)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            matcher.appendReplacement(buffer, "$1 $2 $3 $4\n");
        }
        matcher.appendTail(buffer);
        System.out.println(buffer);
    }
    private static void replacing() {
        String text = "-->The---quick---brown---fox---jumped!!";
        StringBuffer buffer = new StringBuffer();
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text);
        boolean flip = false;
        for (int i = 0; matcher.find(); i++) {
            String group = matcher.group();
            flip = !flip;
            if (flip) {
                group = group.toUpperCase();
            }
            matcher.appendReplacement(buffer, group);
            System.out.println(i + "." + buffer);
        }
        matcher.appendTail(buffer);
        System.out.println(buffer);
    }
}
