package ru.geekbrains.lesson6.srp2;
import java.util.Scanner;
import java.util.ArrayList;

public class ConsoleInput {

    private Scanner scanner = new Scanner(System.in);

    public ArrayList<Field> input(ArrayList<Field> data) {
        for (Field field : data) {
            field.setValue(prompt(field.getTitle() + ": "));
        }
        return data;
    }

    private String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}
