package com.example;

public class ActionsWithNumbersApp {
    public static void main(String[] args) {

        System.out.println(showActionsWithNumbers(5, 7));      
    }

    public static String showActionsWithNumbers(int firstNumber, int secondNumber) {

        int amountNumbers = firstNumber + secondNumber;
        
        int differenceNumbers = firstNumber - secondNumber;

        int multiplicationNumbers = firstNumber * secondNumber;

        double divisionNumbers = firstNumber * 1.0 / secondNumber;

        return String.valueOf(amountNumbers) + " " + String.valueOf(differenceNumbers) + " " + 
               String.valueOf(multiplicationNumbers) + " " + String.format("%.2f", divisionNumbers);
    }   
}
