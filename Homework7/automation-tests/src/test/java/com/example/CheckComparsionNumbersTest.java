package com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

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

        expectThrows(SameNumbersException.class,
            () -> ComparisonNumberApp.firstNumberMoreSecond(0, 0));
    } 
}
