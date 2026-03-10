package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CheckAreaTriangleTest {

    @Test
    public void checkAreaTriangle() {

        assertEquals("20.0", AreaTriangleApp.calculateAreaTriangle(10.0, 4.0));
    }

    @Test
    public void impossibleComparsionAreaTriangle() {

        assertEquals("Высота и основание не могут быть отрицательными или равными нулю!", AreaTriangleApp.calculateAreaTriangle(0, -8));
    }
    
}
