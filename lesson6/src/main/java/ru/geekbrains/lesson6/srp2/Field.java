package ru.geekbrains.lesson6.srp2;

public class Field {

    private String name;
    private String title;
    private String type;
    private Object value;

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Field(String name, String title, String type) {
        this.name = name;
        this.title = title;
        this.type = type;
    }
}
