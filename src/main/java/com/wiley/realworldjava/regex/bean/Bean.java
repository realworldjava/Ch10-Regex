package com.wiley.realworldjava.regex.bean;

import jakarta.validation.constraints.Pattern;

public class Bean {

    @Pattern(regexp = "[A-Z]+")
    private String uppercaseLetters;

    public String getUppercaseLetters() {
        return uppercaseLetters;
    }

    public void setUppercaseLetters(String uppercaseLetters) {
        this.uppercaseLetters = uppercaseLetters;
    }
}
