package com.wiley.realworldjava.regex.apis;

public class ReplacingWithString {

    public static void main(String[] args) {
        replacing();

        backreference();
    }

    private static void backreference() {
        String text = "java book";
        System.out.println(text.replaceAll("(\\w+)\\s(\\w+)", "$2 $1")); // book java
    }

    private static void replacing() {
        String text = "java book";
        System.out.println(text.replaceAll("[aeiou]", "_")); // j_v_ b__k
        System.out.println(text.replaceFirst("[aeiou]", "_")); // j_va book

        System.out.println(text.replaceAll("\\w+", "[word]")); // [word] [word]

        // does not use a regular expression
        System.out.println(text.replace("\\w+", "[word]")); // java book
    }
}
