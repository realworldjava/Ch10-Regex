package com.wiley.realworldjava.regex.code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VirtualThreadExample {

    public static void main(String[] args) {
        replaceAllApproach();
        loopApproach();
    }

    private static void loopApproach() {
        String text = "VirtualThread[#22]/runnable@ForkJoinPool-1-worker-1";

        String regex = "(.+]).*@(.+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String virtualThread = matcher.group(1);
            String pooledThread = matcher.group(2);

            System.out.println(virtualThread);
            System.out.println(pooledThread);
        }
    }

    private static void replaceAllApproach() {
        String text = "VirtualThread[#22]/runnable@ForkJoinPool-1-worker-1";

        String virtualThread = text.replaceFirst("].*$", "]");
        String pooledThread = text.replaceFirst("^.*@", "");

        System.out.println(virtualThread);
        System.out.println(pooledThread);
    }

}
