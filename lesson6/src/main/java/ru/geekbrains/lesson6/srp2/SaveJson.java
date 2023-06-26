package ru.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SaveJson {

    private String filename;

    public SaveJson(String filename) {
        this.filename = filename + ".json";
    }

    public void export(ArrayList<Field> data) {
        try (FileWriter writer = new FileWriter(filename, false)) {
            writer.write("{\n");
            int counter = 1;
            for (Field field : data) {
                if (field.getType() == "String") {
                    writer.write("\"" + field.getTitle() + "\":\"" + field.getValue() + "\",\n");
                } else {
                    writer.write("\"" + field.getTitle() + "\":" + field.getValue() + (counter == data.size() ? "\n" : ",\n"));
                }
                counter++;
            }
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }       
    }
}
