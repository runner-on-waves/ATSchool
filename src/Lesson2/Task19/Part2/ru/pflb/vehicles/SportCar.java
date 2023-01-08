package Lesson2.Task19.Part2.ru.pflb.vehicles;

import Lesson2.Task19.Part2.ru.pflb.details.Engine;
import Lesson2.Task19.Part2.ru.pflb.professions.Driver;

public class SportCar extends Car {
    int maxVelocity;

    public SportCar(String model,int weight, Driver driver, Engine engine, int maxVelocity) {
        super(model, weight, driver, engine);
        this.maxVelocity = maxVelocity;
        this.vehicleClass = VehicleClass.SPORTS_CAR;
    }

    @Override
    public String toString() {
        return String.format("Модель: <%s>, класс: <%s>\nХарактеристики:\n  вес: <%s>\n  максимальная скорость: <%s> \n  двигатель: %s\nВодитель: %s\n",
                             model,vehicleClass.name(), weight, maxVelocity, engine, driver);

    }
}
