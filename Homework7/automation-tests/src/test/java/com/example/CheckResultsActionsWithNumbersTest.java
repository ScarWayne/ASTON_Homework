package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CheckResultsActionsWithNumbersTest {

    String[] parts = ActionsWithNumbersApp.showActionsWithNumbers(5,7).split(" ");

    @Test
    public void checkAmountNumbers() {

        assertEquals("12", parts[0]);        
    }

    @Test
    public void checkDifferenceNumbers() {

        assertEquals("-2", parts[1]);
    }

    @Test
    public void checkMultiplicationNumbers() {

        assertEquals("35", parts[2]);
    }

    @Test
    public void checkDivisionNumbers() {

        assertEquals("0,71", parts[3]);
    }
    
}
