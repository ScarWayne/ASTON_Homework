package Homework4.Task2.Actions;

public interface ActionWithRectangle extends ActionWithFigure {

    double takeA();
    double takeB();

    @Override

    default String calculatePerimetr() {

         if (takeA() > 0 && takeB() > 0) {

            double p = (takeA() + takeB()) * 2;
        
            return p + " см";

        } else {

            return "Для расчета периметра введите корректные значения сторон!";

        }
    }

    default String calculateSquare() {

        if(takeA() > 0 && takeB() > 0) {
            
            double s = takeA() * takeB();

            return s + " см2";

        } else {

            return "Для расчета площади введите корректные значения сторон!";

        }
    }
} 
