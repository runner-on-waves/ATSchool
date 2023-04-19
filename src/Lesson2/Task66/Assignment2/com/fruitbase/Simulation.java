package Lesson2.Task66.Assignment2.com.fruitbase;

import Lesson2.Task66.Assignment2.com.fruitbase.customers.Customer;
import Lesson2.Task66.Assignment2.com.fruitbase.customers.FreshCustomer;
import Lesson2.Task66.Assignment2.com.fruitbase.customers.UniqueCustomer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;

public class Simulation {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        if (args.length == 0) {
            System.out.println("Заказ не указан в аргументах командной строки");
            return;
        }
        FruitBase fruitBase = new FruitBase();

        System.out.println("Исходный каталог фруктов:");//отладочный вывод исходного каталога в классе
        System.out.println(fruitBase); //отладочный вывод исходного каталога в классе
        for (int i = 0; i < args.length; i++) {
            String path = "";
            if (args[i].equals("-e") || args[i].equals("--export")) {
                if (i + 2 < args.length && args[i + 1].equals("=")) {// проверка наличия пути к файлу
                    path = args[i + 2];
                }
                System.out.println("Начинаем экспорт");
                try {
                    fruitBase.exportCatalogue(path);
                } catch (FileNotFoundException e) {
                    System.out.println("Не найден файл");
                    e.printStackTrace();
                    System.exit(-1);
                } catch (IOException e) {
                    System.out.println("Ошибка при экспорте каталога");
                    e.printStackTrace();
                    System.exit(-1);
                } catch (Exception e) {
                    System.out.println("Непредвиденная ошибка при экспорте каталога в файл");
                    e.printStackTrace();
                    System.exit(-1);
                }
            } else if (args[i].equals("-i") || args[i].equals("--import")) {
                if (i + 2 < args.length && args[i + 1].equals("=")) {// проверка наличия пути к файлу
                    path = args[i + 2];
                }
                System.out.println("Начинаем импорт");
                try {
                    fruitBase.importCatalogue(path);
                    System.out.println("Загруженный каталог фруктов:");
                    System.out.println(fruitBase);
                    System.out.println(" ");
                } catch (FileNotFoundException e) {
                    System.out.println("Не найден файл");
                    e.printStackTrace();
                    System.exit(-1);
                } catch (InvalidClassException e) {
                    System.out.println("Невозможно импортировать каталог из файла : неподдерживаемая версия");
                    e.printStackTrace();
                    System.exit(-1);
                } catch (IOException e) {
                    System.out.println("Ошибка при импорте  каталога");
                    e.printStackTrace();
                    System.exit(-1);
                } catch (Exception e) {
                    System.out.println("Непредвиденная ошибка при экспорте каталога в файл");
                    System.exit(-1);
                }

            }
        }

        //Блок для проверки заказов покупателей
        Customer[] customers = {new FreshCustomer("Fresh"), new UniqueCustomer("Unique")};
        for (int i = 0; i < customers.length; i++) {
            Delivery delivery = fruitBase.takeOrder(args);
            System.out.println("Груз до покупок");
            System.out.println(delivery);
            customers[i].takeFruits(delivery);
            System.out.println("");
            System.out.print("Покупатель " + (i + 1) + " тип " + customers[i].getClass().getSimpleName() + " с именем " + customers[i] + " купил: ");
            customers[i].printPurchases();
            System.out.println("");
            System.out.println("Груз после покупок");
            System.out.println(delivery);
            System.out.println("");

        }
    }
}