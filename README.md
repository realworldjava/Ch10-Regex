# Chapter 10: Pattern Matching with Regular Expressions

This repository contains the code from the book for Chapter 10, Pattern Matching with Regular Expressions. See the [main book page](https://github.com/realworldjava) for the list of all chapter specific repositories.

# How this repository is organized

In this repository, all code is in the main branch. The packages separate the code by concept. There is also a src/main/TextBlock.txt file used in the chapter intro.

| Folder Name  | Corresponding Section |
| ------------- | ------------- |
|src/main/java/com.wiley.realworldjava.regex.code|All sections not listed separately|
|src/main/java/com.wiley.realworldjava.regex.escaping|Escaping Characters|
|src/main/java/com.wiley.realworldjava.regex.apis|Using Regular Expressions with Java APIs|
|src/main/java/com.wiley.realworldjava.regex.commons|Coding Regular Expressions for Apache Commons Validator|
|src/test/java/com.wiley.realworldjava.regex.junit|Coding Regular Expressions for JUnit|
|src/main/java/com.wiley.realworldjava.regex.bean|Coding Regular Expressions for Bean Validation|
|src/main/java/com.wiley.realworldjava.regex.spring|Coding Regular Expressions for Spring|
|src/main/java/com.wiley.realworldjava.regex.noregex|Not a Regular Expression|

# How to run the examples in this chapter

If you want to use an IDE, import the repository as a Maven project so you have the proper  dependencies.

If you want to use the command line, cd to the directory for that example and run 
```
mvn verify
```

# Clickable Links from the Further References Section

* [Victor’s Pluralsight Course on Regular Expressions](https://www.pluralsight.com/courses/playbook-regular-expressions-java-fundamentals)
* [Java Pattern Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/regex/Pattern.html)
* [ Regular Expression Tester](https://regex101.com)
* [Apache Commons CSV](https://commons.apache.org/proper/commons-csv)
* [Open CSV](https://opencsv.sourceforge.net)
* [Apache Commons Validator](https://commons.apache.org/proper/commons-validator)
* [Regular Expression crossword puzzles for learning them better](https://regexcrossword.com)

