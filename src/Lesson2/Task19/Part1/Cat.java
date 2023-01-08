package Lesson2.Task19.Part1;

public class Cat extends Animal {

    // Конструктор класса Cat
    Cat(String name, String food, String location, HealthState health, int foodCounter) {
        super(name, food, location, health, foodCounter);
    }

    // Переопределение методов
    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }

    @Override
    public void eat() {
        this.foodCounter--;
        System.out.println("Кот ест " + this.food + " Осталось " + this.foodCounter + " пачек корма.");

    }
}
