package Lesson2.Task19.Part1;

public class Horse extends Animal {

    // Конструктор класса Horse
    Horse(String name, String food, String location, HealthState health, int foodCounter) {
        super(name, food, location, health, foodCounter);
    }

    // Переопределение методов
    @Override
    public void makeSound() {
        System.out.println("Игого!");
    }

    @Override
    public void eat() {
        this.foodCounter--;
        System.out.println("Лошадь ест " + this.food + " Осталось " + this.foodCounter + " пачек корма.");

    }
}


