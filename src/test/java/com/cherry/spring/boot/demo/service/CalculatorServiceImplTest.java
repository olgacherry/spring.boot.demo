package com.cherry.spring.boot.demo.service;

import com.cherry.spring.boot.demo.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();
       @Test
    public void shouldCorrectlyCalculateSum(){
           Integer num1 = 5;
           Integer num2 = 5;
           Integer expectedSum = num1+num2;
           Assertions.assertEquals(expectedSum,calculatorService.plus(num1,num2));
       }
    @Test
    public void shouldCorrectlyCalculateSub(){
        Integer num1 = 5;
        Integer num2 = 5;
        Integer expectedSub = num1-num2;
        Assertions.assertEquals(expectedSub,calculatorService.minus(num1,num2));
    }
    @Test
    public void shouldCorrectlyCalculateMult(){
        Integer num1 = 5;
        Integer num2 = 5;
        Integer expectedMult = num1*num2;
        Assertions.assertEquals(expectedMult,calculatorService.multiply(num1,num2));
    }
    @Test
    public void shouldCorrectlyCalculateDiv(){
        Integer num1 = 5;
        Integer num2 = 5;
        Integer expectedDiv = num1/num2;
        Assertions.assertEquals(expectedDiv,calculatorService.divide(num1,num2));
    }
    @Test
    public void shouldTrowExceptionWhenSecondArgumentIsZero(){
           Integer num1 = 5;
           Integer num2 = 0;
           Assertions.assertThrows(
                   IllegalArgumentException.class,
                   ()->calculatorService.divide(num1,num2)
           );
           }
    }

