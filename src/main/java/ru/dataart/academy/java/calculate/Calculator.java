package ru.dataart.academy.java.calculate;

import ru.dataart.academy.java.figures.Figure;

public class Calculator {

    public double getSumOfAreas(Figure[] figures) {
        double sum = 0;
        for (Figure f : figures) {
            sum += f.area();
        }
        return sum;
    }
}