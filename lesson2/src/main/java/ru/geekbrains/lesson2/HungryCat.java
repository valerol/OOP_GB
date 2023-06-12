package ru.geekbrains.lesson2;

public class HungryCat {

    private String name;
    
    private int appetite;

    private boolean fed;
    
    public HungryCat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fed = false;
    }

    public void info() {
        if (fed) {
            System.out.println(name + " is fed");
        } else {
            System.out.println(name + " is hungry");
        }
    }
    
    public void eat(Plate plate) {
        if (plate.getFood() < appetite) {
            System.out.println("Not enough food!");
            plate.addFood();
            plate.info();
            this.eat(plate);
        } else {
            plate.setFood(plate.getFood() - this.appetite);
            this.fed = true;
        }
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name =  name;
    }
    
    public int getAppetite() {
        return appetite;
    }
    
    public void setAppetite(int appetite) {
        this.appetite =  appetite;
    }
}