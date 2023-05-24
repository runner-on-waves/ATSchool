package Lesson7.Task6.Assignment1;

public class Banana implements Fruit {
    private String name;

    Banana(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


}
