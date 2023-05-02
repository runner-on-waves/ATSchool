package Lesson2.Task66.Assignment2.com.fruitbase;

import Lesson2.Task66.Assignment2.com.fruitbase.customers.Customer;
import Lesson2.Task66.Assignment2.com.fruitbase.customers.FreshCustomer;
import Lesson2.Task66.Assignment2.com.fruitbase.customers.UniqueCustomer;
import Lesson2.Task66.Assignment2.com.fruitbase.fruits.Fruit;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.math.BigDecimal;

public class Simulation {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Заказ не указан в аргументах командной строки");
            return;
        }
        FruitBase fruitBase = new FruitBase();
        System.out.println("Исходный каталог фруктов:");//отладочный вывод исходного каталога в классе
        System.out.println(fruitBase); //отладочный вывод исходного каталога в классе
        String path = getPath(args);
        if (isExport(args)) {
            handleExport(fruitBase, path);
        } else if (isImport(args)) {
            handleImport(fruitBase, path);
        }

        // Покупатели
        Customer[] customers = prepareCustomers("Fresh", "Rich", "Unique"); //Подготовка списка покупателей с разными типами

        for (int i = 0; i < customers.length; i++) {
            Delivery delivery = fruitBase.takeOrder(args);
            System.out.println("Груз до покупок");
            System.out.println(delivery);
            try {
                customers[i].takeFruits(delivery);
            } catch (NullPointerException e) {
                System.out.println("Введенный тип покупателя не поддерживается.");
                System.exit(-1);
            }

            System.out.println("");
            System.out.print("Покупатель " + (i + 1) + " тип " + customers[i].getClass().getSimpleName() + " с именем " + customers[i] + " купил: ");
            customers[i].printPurchases();
            System.out.println("");
            System.out.println("Груз после покупок");
            System.out.println(delivery);
            System.out.println("");

        }
    }

    public static String getPath(String[] args) {
        String defaultPath = "C:\\javaHomework\\Lesson3\\save.ser";//путь по умолчанию
        String path = "";
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-e") || args[i].equals("--export") || args[i].equals("-i") || args[i].equals("--import")) {
                if (i + 2 < args.length && args[i + 1].equals("=")) {// проверка наличия пути к файлу
                    path = args[i + 2];
                }
            }
        }
        if (path.equals("")) {
            return defaultPath;
        }
        return path;
    }

    public static boolean isImport(String[] args) {
        boolean isImport = false;
        for (String arg : args) {
            if (arg.equals("-i") || arg.equals("--import")) {
                isImport = true;
                break;
            }
        }
        return isImport;
    }

    public static boolean isExport(String[] args) {
        boolean isExport = false;
        for (String arg : args) {
            if (arg.equals("-e") || arg.equals("--export")) {
                isExport = true;
                break;
            }
        }
        return isExport;
    }

    public static void handleExport(FruitBase fruitBase, String path) {
        try {
            System.out.println("Начинаем экспорт");
            fruitBase.exportCatalogue(path);
        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл");
            System.exit(-1);
        } catch (IOException e) {
            System.out.println("Ошибка при экспорте каталога");
            System.exit(-1);
        } catch (RuntimeException e) {
            System.out.println("Непредвиденная ошибка при экспорте каталога в файл");
            System.exit(-1);
        }
    }

    public static void handleImport(FruitBase fruitBase, String path) {
        System.out.println("Начинаем импорт");
        try {
            fruitBase.importCatalogue(path);
            System.out.println("Загруженный каталог фруктов:");
            System.out.println(fruitBase);
            System.out.println(" ");
        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл");
            System.exit(-1);
        } catch (InvalidClassException | ClassNotFoundException e) {
            System.out.println("Невозможно импортировать каталог из файла : неподдерживаемая версия");
            System.exit(-1);
        } catch (IOException e) {
            System.out.println("Ошибка при импорте  каталога");
            System.exit(-1);
        } catch (RuntimeException e) {
            System.out.println("Непредвиденная ошибка при мпорте каталога в файл");
            System.exit(-1);
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка при импорте каталога в файл");
            System.exit(-1);
        }
    }

    public static Customer[] prepareCustomers(String... args) {
        Customer[] customers = new Customer[args.length];
        for (int i = 0; i < args.length; i++) {
            String param = args[i];
            switch (param) {
                case "Fresh":
                    customers[i] = new FreshCustomer(param);
                    break;
                case "Unique":
                    customers[i] = new UniqueCustomer(param);
                    break;
                case "Rich":
                    customers[i] = new Customer("Rich") {
                        @Override
                        public void takeFruits(Delivery delivery) {//выбирает только дорогие фрукты
                            Fruit[] currentCargoFruits = delivery.getFruits();
                            BigDecimal maxPrice = new BigDecimal("0");
                            for (Fruit fruit : currentCargoFruits) {
                                if (fruit.getPrice().compareTo(maxPrice) > 0) {
                                    maxPrice = fruit.getPrice();
                                }

                            }
                            BigDecimal limit = maxPrice.multiply(BigDecimal.valueOf(0.75));
                            for (Fruit fruit : currentCargoFruits) {
                                if (fruit.getPrice().compareTo(limit) >= 0) {
                                    Fruit[] arrayCopy = purchases;
                                    purchases = new Fruit[arrayCopy.length + 1]; // резервируем место
                                    System.arraycopy(arrayCopy, 0, purchases, 0, arrayCopy.length);
                                    purchases[purchases.length - 1] = fruit;
                                    delivery.removeFruit(fruit);
                                }
                            }
                        }
                    };
                    break;
                default:
                    System.out.println("Введенный тип покупателя " + param + " не поддерживается.");
                    break;
            }
        }
        return customers;
    }


}
