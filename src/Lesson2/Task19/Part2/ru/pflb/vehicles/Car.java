package Lesson2.Task19.Part2.ru.pflb.vehicles;


import Lesson2.Task19.Part2.ru.pflb.details.Engine;
import Lesson2.Task19.Part2.ru.pflb.professions.Driver;

public class Car {
    String model; // название модели автомобиля
    VehicleClass vehicleClass;// класc автомобиля типа vehicleClass
    int weight; // вес автомобиля в килограммах
    Driver driver; //водитель, за которым закреплен автомобиль
    Engine engine; // тип мотора типа Engine

    public Car(String model, VehicleClass vehicleClass, int weight, Driver driver, Engine engine) {
        this.model = model;
        this.vehicleClass = vehicleClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public Car(String model, int weight, Driver driver, Engine engine) {
        this.model = model;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;

    }
    public void start() {
        System.out.println("Поехали!");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String toString() {
        return String.format("Модель: <%s>, класс: <%s>\nХарактеристики:\n  вес: <%s>\n  двигатель: %s\nВодитель: %s\n",
                             model, vehicleClass.name(), weight, engine, driver);

    }
}
