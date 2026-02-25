package Homework4.Task2.Figurs;

import Homework4.Task2.Actions.ActionWithTriangle;

public class Triangle extends Figure implements ActionWithTriangle {

    private double x;
    private double y;
    private double z;
        
    public Triangle(String fillColor, String borderColor, double x, double y, double z) {

        super(fillColor, borderColor);
        this.x  = x;
        this.y = y; 
        this.z = z;

    }

    public double takeX() {

        return x;

    }

    public double takeY() {

        return y;
        
    }

    public double takeZ() {

        return z;
        
    }

    @Override

    public void showFigure() {

        System.out.println("Цвет треугольника: " + fillColor + "\n" +
                           "Цвет границ треугольника: " + borderColor);
        
        System.out.println("Периметр треугольника: " + calculatePerimetr());
        System.out.println("Площадь треугольника: " + calculateSquare());

    }
}

