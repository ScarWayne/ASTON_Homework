package com.example.Clases;

public class SameNumbersException extends RuntimeException {

    String message;

    public SameNumbersException(String message){
        super(message);
    }    
}
