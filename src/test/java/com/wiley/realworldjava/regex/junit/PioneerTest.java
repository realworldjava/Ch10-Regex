package com.wiley.realworldjava.regex.junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junitpioneer.jupiter.params.DisableIfDisplayName;

import java.util.List;

public class PioneerTest {

    static List<String> months() {
        return List.of("January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December");
    }

    @DisableIfDisplayName(matches = "^Month: \\w{6,}$")
    @ParameterizedTest(name = "Month: {0}")
    @MethodSource("months")
    void shortMonths(String reason) {
        // test short month name
    }

}
