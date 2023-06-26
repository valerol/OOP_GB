package ru.geekbrains.lesson6.srp2;

import java.util.ArrayList;
import java.util.Arrays;

public class Order {

    private ArrayList<Field> fields = new ArrayList<Field>(Arrays.asList(        
        new Field("clientName", "Имя клиента", "String"),
        new Field("product", "Продукт", "String"),
        new Field("qnt", "Кол-во", "Int"),
        new Field("price", "Цена", "Float") 
    ));

    {
        for (Field field : fields) {
            switch (field.getName()) {
                case "clientName":
                {
                    field.setValue("John Doe");
                }
                break;
                case "product":
                {
                    field.setValue("Test product");
                }
                break;
                case "qnt":
                {
                    field.setValue("1");
                }
                break;
                case "price":
                {
                    field.setValue("0.01");
                }
                break;
            }
        }
    }

    public Order() {

    }

    public Order(String clientName, String product, int qnt, int price) {
        for (Field field : fields) {
            switch (field.getName()) {
                case "clientName":
                {
                    field.setValue(clientName);
                }
                case "product":
                {
                    field.setValue(product);
                }
                case "qnt":
                {
                    field.setValue(qnt);
                }
                case "price":
                {
                    field.setValue(price);
                }
            }
        }
    }

    public ArrayList<Field> getFields() {
        return fields;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("Ваш заказ:\n");
        for (Field field : fields) {
            res.append(String.format("%s: %s\n", field.getTitle(), field.getValue()));
        }
        return res.toString();
    }
}
