/*
Применяя интерфейсы написать программу расчета периметра и площади геометрических фигур: круг, прямоугольник, треугольник. 

Задать для каждой фигуры цвет заливки и цвет границы. 

Результат полученных характеристик [ Периметр, площадь, цвет фона, цвет границ ] по каждой фигуре вывести в консоль. 

Попробуйте реализовать базовые методы, такие как расчет периметра фигур, в качестве дефолтных методов в интерфейсе.

*/

package Homework4.Task2;

import Homework4.Task2.Figurs.*;

public class Main {
    
    public static void main(String[] args) {
        
        Figure circle = new Circle("Белый", "Черный", 7.7);
        circle.showFigure();
        System.out.println();

        Figure rectangle = new Rectangle("Синий", "Красный", 10.1, 6.0);
        rectangle.showFigure();
        System.out.println();

        Figure triangle = new Triangle("Зеленый", "Желтый", 10.0, 5.5, 7.7);
        triangle.showFigure();
        System.out.println();

    }
}
