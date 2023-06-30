package ru.geekbrains.lesson7.observer;

public class Vacancy {

    private String position;
    private double maxSalary;
    private Type type;

    public Vacancy(String position, double maxSalary, Type type) {
        this.type = type;
        this.position = position;
        this.maxSalary = maxSalary;
    }

    public double getSalary() {
        return maxSalary;
    }

    public String getPosition() {
        return position;
    }

    public Type getType() {
        return type;
    }
}

enum Type {
    UNSKILLED,
    PROFESSIONAL,
    EXPERT
};
