package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.example.Clases.NegativeNumberException;

public class CalculationFactorialAppTest {
    
    @Test
    public void checkCalculationFactorial() {
                
        assertEquals(120, NumberFactorialApp.knowNumberFactorial(5));
    }

    @Test
    public void checkCalculationFactorialZero() {

        assertEquals(1, NumberFactorialApp.knowNumberFactorial(0));
    }

    @Test
    public void checkNegativeFactorial() {

        assertThrows(NegativeNumberException.class, 
            () -> NumberFactorialApp.knowNumberFactorial(-5));          
    }
}
