package Lesson2.Task19.Part2.ru.pflb.vehicles;

import Lesson2.Task19.Part2.ru.pflb.details.Engine;
import Lesson2.Task19.Part2.ru.pflb.professions.Driver;

public class Lorry extends Car {
    int loadingAmount; //грузоподъемность в киллограммах

    public Lorry(String model,int weight, Driver driver, Engine engine, int loadingAmount) {
        super(model,weight, driver, engine);
        this.loadingAmount = loadingAmount;
        if (this.loadingAmount <= 5000)
            this.vehicleClass = VehicleClass.MEDIUM;
        else
            this.vehicleClass = VehicleClass.LARGE;
    }

    @Override
    public String toString() {
        return String.format("Модель: <%s>, класс: <%s>\nХарактеристики:\n  вес: <%s>\n  грузоподъемность: <%s> \n  двигатель: %s\nВодитель: %s\n",
                             model, this.vehicleClass.name(), weight, loadingAmount, engine, driver);

    }


}
