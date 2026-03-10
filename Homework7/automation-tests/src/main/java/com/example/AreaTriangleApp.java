package com.example;

public class AreaTriangleApp {
    public static void main(String[] args) {

        System.out.println(calculateAreaTriangle(10.0, 5.5));      
    }
    
    public static String calculateAreaTriangle(double base, double height) {

        if (base > 0 && height > 0) {

        double areaTriangle = (base * height) / 2;

        return String.valueOf(areaTriangle);

        } else {
            
            return "Высота и основание не могут быть отрицательными или равными нулю!";
        }
    }
}
