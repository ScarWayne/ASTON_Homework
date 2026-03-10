package com.example.Clases;

public class NegativeNumberException extends RuntimeException {
    
    String message;

    public NegativeNumberException(String message) {

        super(message);
    }  
}
