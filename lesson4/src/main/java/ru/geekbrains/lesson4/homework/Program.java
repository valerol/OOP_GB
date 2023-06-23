package ru.geekbrains.lesson4.homework;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {

        Box<Apple> AppleBox = new Box<>();
        Box<Orange> OrangeBox = new Box<>();

        AppleBox.addFruit(new Apple());
        AppleBox.addFruit(new Apple());
        AppleBox.addFruit(new Apple());
        AppleBox.addFruit(new Apple());
        AppleBox.addFruit(new Apple());
        AppleBox.addFruit(new Apple());

        OrangeBox.addFruit(new Orange());
        OrangeBox.addFruit(new Orange());
        OrangeBox.addFruit(new Orange());
        OrangeBox.addFruit(new Orange());

        Box<Apple> AppleBox1 = new Box<>();

        System.out.println("Orange box weight: " + OrangeBox.getWeight());
        System.out.println("Apple box weight: " + AppleBox.getWeight());

        System.out.println(AppleBox.compare(OrangeBox) ? "Boxes weigh similar" : "Boxes weight differs");
        AppleBox.pourTo(AppleBox1);

        System.out.println("New AppleBox box weight: " + AppleBox1.getWeight());
        System.out.println("Apple box weight: " + AppleBox.getWeight());
    }

}
