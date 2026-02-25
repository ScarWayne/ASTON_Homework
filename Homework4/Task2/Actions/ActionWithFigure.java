package Homework4.Task2.Actions;

public interface ActionWithFigure {
          
    default String calculatePerimetr() {

        return "Расчет производится в соответствующем интерфейсе";
    }

    
    default String calculateSquare() {

        return "Расчет производится в соответствующем интерфейсе";

    }
    
    void showFigure();

}
