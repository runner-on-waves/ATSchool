package Lesson7.Task6.Assignment2;

public class Apple implements Fruit {
    private String name;

    Apple(String name) {
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