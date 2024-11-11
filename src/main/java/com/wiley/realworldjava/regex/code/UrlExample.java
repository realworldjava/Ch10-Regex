package com.wiley.realworldjava.regex.code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlExample {

    public static void main(String[] args) {
        String uris = """
        http://spring.io/projects/spring-cloud-contract
        https://www.infoq.com/articles/Living-Matrix-Bytecode-Manipulation/
        file:///C:/Documents/happy_birthday_sis.pdf
        """;

        String twoOrMoreSlashes  = "/{2,}";
        String matchAny = "(.+)";
        String matchAnythingButSlash = "([^/]+)";
        String regex = matchAny + ":" + twoOrMoreSlashes  + matchAnythingButSlash + "/" + matchAny;

        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(uris);
        while (matcher.find()) {
            String protocol = matcher.group(1);
            String websiteOrDirectory = matcher.group(2);
            String specificPath = matcher.group(3);
            String formatted = "%s\t%s\t%s".formatted(protocol, websiteOrDirectory, specificPath);
            System.out.println(formatted);
        }
    }
}
