package com.kodilla.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.lang.*;

@SpringBootApplication
public class TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
        Calculator calculator = new Calculator();
        Double numberA = 12.23;
        Double numberB = 23.45;
        System.out.println(calculator.addition(numberA, numberB));
        System.out.println(calculator.subtraction(numberA, numberB));

    }

}
