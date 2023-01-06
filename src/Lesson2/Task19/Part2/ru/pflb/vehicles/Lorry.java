package Lesson2.Task19.Part2.ru.pflb.vehicles;

import Lesson2.Task19.Part2.ru.pflb.details.Engine;
import Lesson2.Task19.Part2.ru.pflb.professions.Driver;

public class Lorry extends Car {
    int loadingAmount; //грузоподъемность в киллограммах
    public String lorry;

    public Lorry(String model, int weight, Driver driver, Engine engine, int loadingAmount) {
        super(model, weight, driver, engine);
        this.loadingAmount = loadingAmount;
        if (this.loadingAmount <= 5000) {
            lorry = VehicleClass.MEDIUM.getName();
        } else lorry = VehicleClass.LARGE.getName();
    }

    @Override
    public String toString() {
        return String.format("Модель: <%s>, класс: <%s>\nХарактеристики:\n  вес: <%s>\n  грузоподъемность: <%s> \n  двигатель: %s\nВодитель: %s",
                model, lorry, weight, loadingAmount, engine.toString(), driver.toString());

    }


}
