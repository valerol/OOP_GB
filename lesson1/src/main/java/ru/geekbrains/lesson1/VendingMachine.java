package ru.geekbrains.lesson1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;


    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                if (((BottleOfWater)product).getVolume()  == volume){
                    return (BottleOfWater)product;
                }
            }
        }
        return null;
    }

    public BottleOfTea getBottleOfTea(String sort, boolean sweet){
        for (Product product : products){
            if (product instanceof BottleOfTea){
                if (((BottleOfTea)product).getSort() == sort && ((BottleOfTea)product).getSweet() == sweet){
                    return (BottleOfTea)product;
                }
            }
        }
        return null;
    }
}
