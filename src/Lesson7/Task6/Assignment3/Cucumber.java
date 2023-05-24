package Lesson7.Task6.Assignment3;

public class Cucumber implements Vegetable {
    private String name;

    Cucumber(String name) {
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
