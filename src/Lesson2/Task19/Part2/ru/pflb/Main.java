package Lesson2.Task19.Part2.ru.pflb;

import Lesson2.Task19.Part2.ru.pflb.details.Engine;
import Lesson2.Task19.Part2.ru.pflb.professions.Driver;
import Lesson2.Task19.Part2.ru.pflb.vehicles.Car;
import Lesson2.Task19.Part2.ru.pflb.vehicles.Lorry;
import Lesson2.Task19.Part2.ru.pflb.vehicles.SportCar;
import Lesson2.Task19.Part2.ru.pflb.vehicles.VehicleClass;

public class Main {
    public static void main(String[] args) {
        //Подготовка объектов
        //Создание объектов водителей
        Driver driver1 = new Driver("Иванов Иван Иванович", 46, 20, 123456789);
        Driver driver2 = new Driver("Петров Петр Петрович", 66, 30, 223356790);
        Driver driver3 = new Driver("Снежкина Антонина Викторовна", 30, 10, 623456781);

        //Создание объектов двигателей
        Engine engine1 = new Engine(73550, "Fiat");
        Engine engine2 = new Engine(155000, "Volkswagen");
        Engine engine3 = new Engine(350000, "Lamborghini");
        Engine engine4 = new Engine(380000, "Truck");

        //Создание объектов машин
        Car car1 = new Car("Nissan Micra", VehicleClass.MINI, 1300, driver1, engine1);
        Lorry lorry1 = new Lorry("Dongfeng Captain-T", 2500, driver2, engine2, 4500);
        Lorry lorry2 = new Lorry("Dongfeng Captain-T", 2900, driver2, engine4, 5500);
        SportCar sportCar1 = new SportCar("Lamborghini Miura", 1292, driver3, engine3, 350);

        //Вывод информации об объектах-машинах
        System.out.println(car1 + "\n");
        System.out.println(lorry1 + "\n");
        System.out.println(sportCar1 + "\n");
        System.out.println(lorry2 + "\n");

        // Вызов Методов для объектов
        car1.start();
        car1.stop();
        car1.turnRight();
        car1.turnLeft();
    }

}
