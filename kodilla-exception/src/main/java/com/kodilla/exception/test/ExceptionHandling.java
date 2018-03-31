package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            secondChallenge.probablyIWillThrowException(2.0,3.0);
        }
        catch (Exception e){
            System.out.println("Something probably went wrong");
        }
        finally {
            System.out.println("Not really needed sentence, but ill put it here");
        }
    }

}
