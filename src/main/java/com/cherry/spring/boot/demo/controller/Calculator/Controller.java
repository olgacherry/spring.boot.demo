package com.cherry.spring.boot.demo.controller.Calculator;

import com.cherry.spring.boot.demo.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final CalculatorService calculatorService;
    public Controller(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public int plus(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2
    ) {
        return calculatorService.plus(num1 , num2);
    }

    @GetMapping("/minus")
    public int minus(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2
    ) {
        return calculatorService.minus(num1 , num2);

    }
    @GetMapping("/multiply")
    public int multiply(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2
    ) {
        return calculatorService.multiply(num1 , num2);

    }
    @GetMapping("/divide")
    public int divide(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2
    ) {
        return calculatorService.divide( num1 , num2);

    }
}