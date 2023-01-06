package Lesson2.Task19.Part2.ru.pflb.vehicles;

import Lesson2.Task19.Part2.ru.pflb.details.Engine;
import Lesson2.Task19.Part2.ru.pflb.professions.Driver;

public class SportCar extends Car {
    int maxVelocity;
    public String sportCarType;
    public SportCar(String model, int weight, Driver driver, Engine engine, int maxVelocity) {
        super(model, weight, driver, engine);
        this.maxVelocity = maxVelocity;
        sportCarType = VehicleClass.SPORTS_CAR.getName();
    }

    @Override
    public String toString() {
        return String.format("Модель: <%s>, класс: <%s>\nХарактеристики:\n  вес: <%s>\n  максимальная скорость: <%s> \n  двигатель: %s\nВодитель: %s",
                model,sportCarType, weight, maxVelocity, engine.toString(), driver.toString());

    }
}
