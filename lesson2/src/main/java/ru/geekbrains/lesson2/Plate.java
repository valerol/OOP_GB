package ru.geekbrains.lesson2;

import java.util.Scanner;

public class Plate {
    
    private int food;
    
    public Plate(int food) {
        this.food = food;
    }
    
    public void info() {
        System.out.println("plate: " + food);
    }
    
    public int getFood() {
        return food;
    }
    
    public void setFood(int food) {
        this.food = food;
    }

    public void addFood() {
        Scanner in = new Scanner(System.in); 
        System.out.println("How much food to add?");
        int moreFood = in.nextInt();
        this.setFood(food + moreFood);
    }
}