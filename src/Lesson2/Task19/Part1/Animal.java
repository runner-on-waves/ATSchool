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

    public String getName() {
        return name;
    }

    public HealthState getHealth() {
        return health;
    }
    public void setHealth(HealthState health) {
        this.health = health;
    }

    public abstract void makeSound();

    public abstract void eat();

    public void sleep() {
        System.out.println("Животное спит.");
    }

    @Override
    public String toString() {

        return String.format("<%s> \n Страна обитания: %s \n Состояние здоровья: %s \n Сколько особей: %s \n",
                             name, location, health.getNameCyrillic(), counter);
    }
}
