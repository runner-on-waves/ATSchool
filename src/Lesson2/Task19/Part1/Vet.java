package Lesson2.Task19.Part1;

import static Lesson2.Task19.Part1.HealthState.HEALTHY;
import static Lesson2.Task19.Part1.HealthState.UNHEALTHY;

public class Vet {
    String name;

    // Конструктор класса Vet
    Vet(String name) {
        this.name = name;
    }

    // Метод для лечения животного
    void treatAnimal(Animal animal) {
        if (animal.health.equals(HEALTHY)) {
            System.out.println("Осуществлен прием у ветеринара " + this.name + "." + " Животное " + animal.name + " здорово. Лечение не требуется.");
        } else if (animal.health.equals(UNHEALTHY)) {
            animal.health = HEALTHY;
            System.out.println("Осуществлен прием у ветеринара " + this.name + "." + " Животное " + animal.name + " вылечено");
        }

    }

}
