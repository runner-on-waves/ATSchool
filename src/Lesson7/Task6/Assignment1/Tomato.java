package Lesson7.Task6.Assignment1;

public class Tomato implements Vegetable {
    private String name;

    Tomato(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


}
