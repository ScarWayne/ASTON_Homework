package com.example;
import com.example.Clases.NegativeNumberException;

public class NumberFactorialApp {
    public static void main(String[] args) {
        
        System.out.println(knowNumberFactorial(6));
    }

    public static int knowNumberFactorial(int number) {

        int n = 1;
        
        if (number > 0) {

            for(int i = 1; i <= number; i ++) {

                n *= i;
            }

            return n;

        } else if (number == 0) {

            return 1;

        } else {
                throw new 
                    NegativeNumberException("Выполнение операции невозможно.");
        }
    }
}
