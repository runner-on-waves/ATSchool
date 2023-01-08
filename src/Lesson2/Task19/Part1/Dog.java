package Lesson2.Task19.Part1;

public class Dog extends Animal {
    // Конструктор класса Dog
    Dog(String name, String food, String location, HealthState health, int foodCounter) {
        super(name, food, location, health, foodCounter);
    }

    // Переопределение методов
    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }

    @Override
    public void eat() {
        this.foodCounter--;
        System.out.println("Собака ест " + this.food + "." + " Осталось " + this.foodCounter + " пачек корма.");

    }
}
