package com.wiley.realworldjava.regex.junit;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJTest {

    @Test
    void chess() {
        String chessNotationRegex = "[a-hA-H][1-8]";
        String actual = "A5";
        assertThat("A5").matches(chessNotationRegex);
    }
}
