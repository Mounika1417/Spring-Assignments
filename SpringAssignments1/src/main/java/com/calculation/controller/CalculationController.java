package com.calculation.controller;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {

    @GetMapping("/calculate")
    public String calculate(
            @RequestParam double num1,
            @RequestParam double num2,
            @RequestParam double num3) {

        double sum = num1 + num2 + num3;
        double average = sum / 3;

        return String.format("Sum: %.2f, Average: %.2f", sum, average);
    }
}