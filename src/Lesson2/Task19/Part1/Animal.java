package Lesson2.Task19.Part1;

public abstract class Animal {
    String name;
    String food;
    int foodCounter;
    String location;
    static int counter;
    HealthState health;

    public Animal(String name, String food, String location, HealthState health, int foodCounter) {
        this.name = name;
        this.food = food;
        this.location = location;
        this.health = health;
        this.foodCounter = foodCounter;
        counter++;
    }

    public void makeSound() {
    }

    public void eat() {
    }

    public void sleep() {
        System.out.println("Животное спит.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
