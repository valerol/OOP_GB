package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class Box <T extends Fruit>{

    private ArrayList<T> fruits = new ArrayList<T>();
    
    public Float getWeight() {
        return fruits.size() > 0 ? fruits.get(0).getWeight() * fruits.size() : 0;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public boolean compare(Box box) {
        return this.getWeight().equals(box.getWeight());
    }

    public void pourTo(Box<T> box) {
        for(T fruit : fruits) {
            box.addFruit(fruit);
        }
        fruits.removeAll(fruits);
    }
}
