package com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CheckResultsActionsWithNumbersTest {

    String[] parts = ActionsWithNumbersApp.showActionsWithNumbers(5,7).split(" ");

    @Test
    public void checkAmountNumbers() {

        assertEquals(parts[0], "12");        
    }

    @Test
    public void checkDifferenceNumbers() {

        assertEquals(parts[1], "-2");
    }

    @Test
    public void checkMultiplicationNumbers() {

        assertEquals(parts[2], "35");
    }

    @Test
    public void checkDivisionNumbers() {

        assertEquals(parts[3], "0,71");
    }
    
}
