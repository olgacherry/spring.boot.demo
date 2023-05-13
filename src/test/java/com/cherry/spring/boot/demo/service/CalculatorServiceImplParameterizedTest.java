package com.cherry.spring.boot.demo.service;

import com.cherry.spring.boot.demo.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceImplParameterizedTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> argumentsSourceForSumTest() {
        return Stream.of(
                Arguments.of(5, 5, 10),
                Arguments.of(1, 1, 2),
                Arguments.of(1, 5, 6)

        );
    }

    @ParameterizedTest
    @MethodSource("argumentsSourceForSumTest")
    public void shouldCorrectlyCalculateSum(Integer num1, Integer num2, Integer expectedSum) {
        Assertions.assertEquals(expectedSum, calculatorService.plus(num1, num2));
    }

    public static Stream<Arguments> argumentsSourceForSubTest() {
        return Stream.of(
                Arguments.of(5, 5, 0),
                Arguments.of(1, 1, 0),
                Arguments.of(6, 5, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsSourceForSubTest")
    public void shouldCorrectlyCalculateSub(Integer num1, Integer num2, Integer expectedSub) {
        Assertions.assertEquals(expectedSub, calculatorService.minus(num1, num2));
    }
    public static Stream<Arguments> argumentsSourceForMultTest() {
        return Stream.of(
                Arguments.of(5, 5, 25),
                Arguments.of(1, 1, 1),
                Arguments.of(6, 5, 30)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsSourceForMultTest")
    public void shouldCorrectlyCalculateMult(Integer num1, Integer num2, Integer expectedMult) {
        Assertions.assertEquals(expectedMult, calculatorService.multiply(num1, num2));
    }
    public static Stream<Arguments> argumentsSourceForDivTest() {
        return Stream.of(
                Arguments.of(5, 5, 1),
                Arguments.of(1, 1, 1),
                Arguments.of(10, 5, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsSourceForDivTest")
    public void shouldCorrectlyCalculateDiv(Integer num1, Integer num2, Integer expectedDiv) {
        Assertions.assertEquals(expectedDiv, calculatorService.divide(num1, num2));
    }
}