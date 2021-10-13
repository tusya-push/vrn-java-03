package ru.dataart.academy.java;

import ru.dataart.academy.java.calculate.Calculator;
import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

public class Main {

    public static void main(String[] args) {
        System.out.print("Task for Java OOP");
        Figure rectangle = new Rectangle(2, 2);
        Figure circle = new Circle(2);
        Figure[] figures = {rectangle, circle};
        Calculator calculator = new Calculator();
        double sum = calculator.getSumOfAreas(figures);
        System.out.println("; the sum is : " + sum);
    }
}