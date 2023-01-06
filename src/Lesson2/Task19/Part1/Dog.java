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

    @Override
    public String toString() {
        String res = String.format(" <%s> \n Страна обитания: %s \n Состояние здоровья: %s \n Сколько особей: %s \n", name, location, health.getNameCyrillic(), counter);
        return res;
    }

}
