package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Student implements Observer {

    private static Random random = new Random();
    private String name;

    private double minSalary;

    private Type level = Type.UNSKILLED;

    public Student(String name) {
        this.name = name;
        minSalary = random.nextDouble(2000, 4000);
    }

    public Type getLevel() {
        return level;
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy) {
        double salary = vacancy.getSalary();
        String position = vacancy.getPosition();
        if (minSalary <= salary){
            System.out.printf("Студент %s (%f) >>> Мне нужна эта работа! [%s, %s - %f]\n",
                    name, minSalary, companyName, position, salary);
            minSalary = salary;
        }
        else {
            System.out.printf("Студент %s >>> Я найду работу получше (%f)! [%s, %s - %f]\n",
                    name, minSalary, companyName, position, salary);
        }
    }
}
