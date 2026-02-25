package Homework4.Task2.Figurs;

import Homework4.Task2.Actions.ActionWithFigure;

abstract public class Figure implements ActionWithFigure {

    protected String fillColor;
    protected String borderColor;
    
    Figure(String fillColor, String borderColor) {

        this.fillColor = fillColor;
        this.borderColor = borderColor;

    }

    @Override

    
    public void showFigure() {

        System.out.println("Цвет фигуры: " + fillColor + "\n" +
                            "Цвет границ фигуры: " + borderColor);
                            
    }
}
