package Lesson7.Task9.Assignment1;

public class Banana implements Fruit {
    private String name;

    Banana(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
