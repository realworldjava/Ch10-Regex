package com.wiley.realworldjava.regex.junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class JUnit5Test {

    enum Env { DEV, TEST, PRE_PROD, PROD};

    @ParameterizedTest
    @EnumSource(mode = EnumSource.Mode.MATCH_ALL, names = "^.*PROD$")
    void monitoring(Env env) {
        // assert env up
    }

}
