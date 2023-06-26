package ru.geekbrains.lesson6;

import ru.geekbrains.lesson6.srp2.ConsoleInput;
import ru.geekbrains.lesson6.srp2.Order;
import ru.geekbrains.lesson6.srp2.SaveJson;

public class Program {

    /**
     * TODO: Задача 1. Домашняя работа. Оптимизировать работу класса Order в  рамках принципа SRP.
     * @param args
     */
    public static void main(String[] args) {
        Order order = new Order();
        ConsoleInput input = new ConsoleInput();
        input.input(order.getFields());
        SaveJson jsonexport = new SaveJson("order2");
        jsonexport.export(order.getFields());
        System.out.println(order);
    }

}
