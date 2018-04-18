package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class Calculator {
    double result;
    private final Display display;

    @Autowired
    public Calculator(final Display display) {
        this.display = display;
    }

    public double add(double a, double b){
        result = a + b;
        display.displayValue(result);
        return result;
    }
    public double sub(double a, double b){
        result = a - b;
        display.displayValue(result);
        return result;
    }
    public double mul(double a, double b){
        result = a * b;
        display.displayValue(result);
        return result;
    }
    public double div(double a, double b){
        result = a / b;
        display.displayValue(result);
        return result;
    }
}
