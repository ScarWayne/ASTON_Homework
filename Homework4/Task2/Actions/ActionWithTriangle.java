package Homework4.Task2.Actions;

public interface ActionWithTriangle extends ActionWithFigure {

    double takeX();
    double takeY();
    double takeZ();

    @Override

    default String calculatePerimetr() {
        
        if ((takeX() > 0 && takeY() > 0 && takeZ() > 0) && 
            ((takeX() + takeY()) > takeZ() || (takeY() + takeZ()) > takeX() ||(takeX() + takeZ()) > takeY())) {

            double p = takeX() + takeY() + takeZ();
       
            return p + " см"; 

       } else if((takeX() > 0 && takeY() > 0 && takeZ() > 0) && 
                ((takeX() + takeY()) <= takeZ() || (takeY() + takeZ()) <= takeX() ||(takeX() + takeZ()) <= takeY())) {

            return "Сумма сторон треугольника не может быть меньше или равна другой стороне. Введите другие значения для подсчета периметра!";

       } else {

            return "Введите коректные значения сторон для подсчета периметра!";
       }
    }

    default String calculateSquare() {

        if ((takeX() > 0 && takeY() > 0 && takeZ() > 0) && 
            ((takeX() + takeY()) > takeZ() || (takeY() + takeZ()) > takeX() ||(takeX() + takeZ()) > takeY())) {

            double pP = (takeX() + takeY() + takeZ()) / 2;
            double s = Math.sqrt(pP  * (pP - takeX()) * (pP - takeY()) * (pP - takeZ()));

            return s + " см2";

        } else if((takeX() > 0 && takeY() > 0 && takeZ() > 0) && 
                ((takeX() + takeY()) <= takeZ() || (takeY() + takeZ()) <= takeX() ||(takeX() + takeZ()) <= takeY())) {

            return "Сумма сторон треугольника не может быть меньше или равна другой стороне. Введите другие значения для подсчета площади!";

       } else {

            return "Введите коректные значения сторон для подсчета площади!";
       }
    }
}
