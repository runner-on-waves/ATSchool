package Lesson7.Task6.Assignment3;

public class Tomato implements Vegetable {
    private String name;

    Tomato(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}