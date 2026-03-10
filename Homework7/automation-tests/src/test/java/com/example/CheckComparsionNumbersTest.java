package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.example.Clases.SameNumbersException;

public class CheckComparsionNumbersTest {

    @Test
    public void checkTrueComparsionNumbers() {

        assertTrue(ComparisonNumberApp.firstNumberMoreSecond(5, 4));
    }

    @Test
    public void checkFalseComparsionNumbers() {

        assertFalse(ComparisonNumberApp.firstNumberMoreSecond(-7, -5));
    }

    @Test
    public void checkThrowComparsionNumbers() {

        assertThrows(SameNumbersException.class,
            () -> ComparisonNumberApp.firstNumberMoreSecond(0, 0));
    } 
}
