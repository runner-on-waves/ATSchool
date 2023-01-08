package Lesson2.Task19.Part1;

import static Lesson2.Task19.Part1.HealthState.HEALTHY;
import static Lesson2.Task19.Part1.HealthState.UNHEALTHY;


public class Main {
    public static void main(String[] args) {

        //Создание объектов-потомков класса Animal
        Dog dog1 = new Dog("Бобик", "Чаппи", "Россия", UNHEALTHY, 100);
        Cat cat1 = new Cat("Рыжик", "Киттикэт", "Россия", UNHEALTHY, 120);
        Horse horse1 = new Horse("Идальго", "овес", "ОАЭ", HEALTHY, 180);

        // Вывод информации по каждой особи
        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(horse1);

        //Вывод звука для каждой особи
        dog1.makeSound();
        cat1.makeSound();
        horse1.makeSound();
        System.out.println("");

        // Вывод метода eat у некоторых особей
        dog1.eat();
        horse1.eat();
        cat1.eat();
        System.out.println("");

        // Создание объекта Vet
        Vet vet1 = new Vet("Петров");

        // Вызов метода приема у ветеринара
        vet1.treatAnimal(dog1);
        vet1.treatAnimal(horse1);
        System.out.println("");

        // Вывод нездорового животного после посещения ветеринара
        System.out.println(dog1);

        //Вызов метода sleep у некоторых животных
        cat1.sleep();
        horse1.sleep();
    }
}
