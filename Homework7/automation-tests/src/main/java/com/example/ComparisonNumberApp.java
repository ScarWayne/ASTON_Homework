package com.example;

import com.example.Clases.SameNumbersException;

public class ComparisonNumberApp {
    public static void main(String[] args) {

        System.out.println(firstNumberMoreSecond(5, 6));        
    }

    public static boolean firstNumberMoreSecond(int firstNumber, int secondNumber) {

        if (firstNumber == secondNumber) {
            throw new
                    SameNumbersException("Числа одинаковые");
        } else {

            return firstNumber > secondNumber;
        }
    }
}
