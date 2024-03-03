package com.gary;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FirstTest {
    private int number;

    @BeforeClass
    public void setup() {
        number = 12;
    }

    @AfterClass
    public void tearDown() {
        number = 0;
    }

    @Test
    public void givenNumber_whenEvent_thenTrue() {
        assertTrue(number % 2 == 0);
    }

}
