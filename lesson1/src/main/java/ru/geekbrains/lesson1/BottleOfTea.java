package ru.geekbrains.lesson1;

public class BottleOfTea extends Product{

    private double volume;
    private String sort;
    private boolean sweet;

    public double getVolume() {
        return volume;
    }

    public String getSort() {
        return sort;
    }

    public boolean getSweet() {
        return sweet;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void setSweet(Boolean sweet) {
        this.sweet = sweet;
    }

    public BottleOfTea(String brand, String name, double price, double volume, String sort, boolean sweet) {
        super(brand, name, price);
        this.volume = volume;
        this.sort = sort;
        this.sweet = sweet;
    }

    @Override
    public String displayInfo() {
        if (sweet) {
            return String.format("[Бутылка]%s - %s - %f - [объем: %f] - %s - sweet", brand, name, price, volume, sort, sweet);
        } else {
            return String.format("[Бутылка]%s - %s - %f - [объем: %f] - %s", brand, name, price, volume, sort);
        }
    }
}
