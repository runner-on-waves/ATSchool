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
        if (animal.getHealth().equals(HEALTHY)) {
            System.out.println("Осуществлен прием у ветеринара " + this.name + "." + " Животное " + animal.getName()+ " здорово. Лечение не требуется.");
        } else if (animal.getHealth().equals(UNHEALTHY)) {
            animal.setHealth(HEALTHY);
            System.out.println("Осуществлен прием у ветеринара " + this.name + "." + " Животное " + animal.getName() + " вылечено.");
        }

    }

}
