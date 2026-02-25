package Homework4.Task2.Figurs;

import Homework4.Task2.Actions.ActionWithRectangle;

public class Rectangle extends Figure implements ActionWithRectangle {
    
    private double a;
    private double b;

    public Rectangle(String fillColor, String borderColor, double a, double b) {

        super(fillColor, borderColor);
        this.a = a;
        this.b = b;

    }

    public double takeA() {

        return a;
        
    }

    public double takeB() {

        return b;
        
    }

    @Override

    public void showFigure() {

        System.out.println("Цвет прямоугольника: " + fillColor + "\n" +
                            "Цвет границ прямоугольника: " + borderColor);
        
        System.out.println("Периметр прямоугольника: " + calculatePerimetr());
        System.out.println("Площадь прямоугольника: " + calculateSquare());

    }
}

