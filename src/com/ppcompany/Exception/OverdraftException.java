package com.ppcompany.Exception;

public class OverdraftException extends Throwable {
    private double deficit;

    public OverdraftException(String message, double deficit){

    }

    public double getDeficit(){
        return deficit;
    }
}
