package Homework4.Task2.Figurs;

import Homework4.Task2.Actions.ActionWithCircle;

public class Circle extends Figure implements ActionWithCircle {

    private double r;
        
    public Circle(String fillColor, String borderColor, double r) {

        super(fillColor, borderColor);
        this.r = r;

    }

    public double takeR() {

        return r;

    }

    @Override

    
    public void showFigure() {

        System.out.println("Цвет круга: " + fillColor + "\n" +
                            "Цвет границ круга: " + borderColor);
        
        System.out.println("К кругу не применяется понятие 'Периметр', но есть длина окружности, и она равна: " + calculatePerimetr());
        System.out.println("Площадь круга: " + calculateSquare());

    }
}
