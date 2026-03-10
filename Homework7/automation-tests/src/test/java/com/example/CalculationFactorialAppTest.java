package com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

import com.example.Clases.NegativeNumberException;

public class CalculationFactorialAppTest {
    
    @Test
    public void checkCalculationFactorial() {
                
        assertEquals(NumberFactorialApp.knowNumberFactorial(5), 120);
    }

    @Test
    public void checkCalculationFactorialZero() {

        assertEquals(NumberFactorialApp.knowNumberFactorial(0), 1);
    }

    @Test
    public void checkNegativeFactorial() {

        expectThrows(NegativeNumberException.class, 
            () -> NumberFactorialApp.knowNumberFactorial(-5));          
    }
}
