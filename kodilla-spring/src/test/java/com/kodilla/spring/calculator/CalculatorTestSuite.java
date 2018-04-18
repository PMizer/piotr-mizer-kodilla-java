package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double resultSum = calculator.add(2.0,4.0);
        double resultSub = calculator.sub(5.0,4.0);
        double resultMul = calculator.mul(2.0,4.0);
        double resultDiv = calculator.div(2.0,4.0);

        //Then
        Assert.assertEquals(6 , resultSum,0.1);
        Assert.assertEquals(1 , resultSub,0.1);
        Assert.assertEquals(8 , resultMul,0.1);
        Assert.assertEquals(0.5 , resultDiv,0.1);
    }
}
