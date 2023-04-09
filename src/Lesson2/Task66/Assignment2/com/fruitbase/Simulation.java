package Lesson2.Task66.Assignment2.com.fruitbase;

import Lesson2.Task66.Assignment2.com.fruitbase.customers.Customer;
import Lesson2.Task66.Assignment2.com.fruitbase.customers.FreshCustomer;
import Lesson2.Task66.Assignment2.com.fruitbase.customers.UniqueCustomer;

public class Simulation {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Заказ не указан в аргументах командной строки");
            return;
        }
        FruitBase fruitBase = new FruitBase();
        System.out.println("Исходный каталог фруктов:");//отладочный вывод исходного каталога в классе
        System.out.println(fruitBase); //отладочный вывод исходного каталога в классе
        System.out.println("Введите флаг для экспрота/импорта каталога");
        for (String s : args) {
            if (s.equals("-e") || s.equals("--export")) {
                System.out.println("Начинаем экспорт");
                fruitBase.exportCatalogue();
            } else if (s.equals("-i") || s.equals("--import")) {
                System.out.println("Начинаем импорт");
                fruitBase.importCatalogue();
                System.out.println("Загруженный каталог фруктов:");
                System.out.println(fruitBase);
                System.out.println(" ");

            }
        }

        //Блок для проверки заказов покупателей
        Customer[] customers = {new FreshCustomer("Fresh"), new UniqueCustomer("Unique")};
        for (int i = 0; i < customers.length; i++) {
            Cargo cargo = fruitBase.takeOrder(args);
            System.out.println("Груз до покупок");
            System.out.println(cargo);
            customers[i].takeFruits(cargo);
            System.out.println("");
            System.out.print("Покупатель " + (i + 1) + " тип " + customers[i].getClass().getSimpleName() + " с именем " + customers[i] + " купил: ");
            customers[i].printPurchases();
            System.out.println("");
            System.out.println("Груз после покупок");
            System.out.println(cargo);
            System.out.println("");

        }
    }
}