package ru.geekbrains.lesson3.task2;

// 20 * 8

/**
 * Спроектировать класс Freelancer самостоятельно в рамках домашнего задания
 */
public class Freelancer extends Employee {

    protected int hours; // Отработано часов в предыдущий месяц

    public Freelancer(String name, String surname, double salary, int age, int hours) {
        super(name, surname, salary, age);
        this.hours = hours;
    }

    //@Override
    public double calculateSalary() {
        return salary * hours;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер, %d лет; Заработная плата (за прошедший месяц): %.2f (руб.)",
                surname, name, age, calculateSalary());
    }
}
