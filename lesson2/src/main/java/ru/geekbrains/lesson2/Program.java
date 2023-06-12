package ru.geekbrains.lesson2;

public class Program {

    public static void main(String[] args) {
        HungryCat[] cats = {
            new HungryCat("Barsik", 5),
            new HungryCat("Tom", 10),
            new HungryCat("Markiz", 15)
        };
        Plate plate = new Plate(10);

        for(HungryCat cat : cats) {
            cat.eat(plate);
            cat.info();
            plate.info();
        }
    }
}