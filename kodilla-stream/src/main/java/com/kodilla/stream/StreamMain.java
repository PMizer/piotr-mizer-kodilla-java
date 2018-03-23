package com.kodilla.stream;

import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.beautifier.*;


public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Beautifying the poems!");
        poemBeautifier.beautify("samochod jechal polna droga", poem -> poem.toUpperCase());
        poemBeautifier.beautify("samochod jechal polna droga", poem -> "ABC"+poem+"ABC");
        poemBeautifier.beautify("samochod jechal polna droga", poem -> poem.substring(poem.length()-3)+poem.substring(0,poem.length()-3));
        poemBeautifier.beautify("samochod jechal polna droga", poem -> poem.replaceFirst("samood","AUTOBUS"));


        }
    }
