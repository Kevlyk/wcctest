package com.wcc.javatest.javatest.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilTest {

    @BeforeEach
    void setUp() {
        //nothing to do
    }

    @AfterEach
    void tearDown() {
        //nothing to do

    }

    @Test
    void calculateDistance() {
        Assertions.assertEquals(MathUtil.calculateDistance(123,123,123,123),0);
    }

    @Test
    void square() {
        Assertions.assertEquals(MathUtil.square(3),9);
    }
}