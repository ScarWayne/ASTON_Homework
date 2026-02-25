package Homework4.Task2.Actions;

public interface ActionWithCircle extends ActionWithFigure {

    double takeR();

    @Override

    default String calculatePerimetr() {

        if (takeR() > 0) {

            double c = 2 * 3.14 * takeR();
        
            return c + " см";

        } else {

            return "Для расчета длины окружности радиус должен быть больше 0!";
       }
    
    }

    default String calculateSquare() {

        if(takeR() > 0) {
            
            double s = 3.14 * takeR() * takeR();

        return s + " см2";

        } else {

            return "Для расчета площади радиус должен быть больше 0!";

        }
    }
}