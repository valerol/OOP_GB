package ru.geekbrains.lesson7.observer;

public interface Observer {

    void receiveOffer(String companyName, Vacancy vacancy);

    Type getLevel();

}
