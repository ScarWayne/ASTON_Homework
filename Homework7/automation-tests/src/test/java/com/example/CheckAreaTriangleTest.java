package com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CheckAreaTriangleTest {

    @Test
    public void checkAreaTriangle() {

        assertEquals(AreaTriangleApp.calculateAreaTriangle(10.0, 4.0), "20.0");
    }

    @Test
    public void impossibleComparsionAreaTriangle() {

        assertEquals(AreaTriangleApp.calculateAreaTriangle(0, -8), "Высота и основание не могут быть отрицательными или равными нулю!");
    }
    
}
