package Lesson2.Task66.Assignment2.com.fruitbase;
import Lesson2.Task66.Assignment2.com.fruitbase.fruits.Fruit;

public class FruitBase {
    private FruitCatalogue fruitList;

    FruitBase() {
        fruitList = new FruitCatalogue();
    }

    public Cargo takeOrder(String[] order) {
        Cargo cargo = new Cargo();

        for (String s : order) {
            Fruit fruit = fruitList.findFruit(s);
            if (fruit != null) {
                cargo.addFruit(fruit);
            }
        }
        return cargo;
    }

    public static void main(String[] args) {
        FruitBase base = new FruitBase();
        if (args.length == 0) {
            System.out.println("Заказ не указан в аргументах командной строки");
            return;
        }
        Cargo cargo = base.takeOrder(args);
        System.out.println("Информация о грузе \n" +
                "Вес: " + cargo.getWeight() + "\n"
                + "Цена: " + cargo.getPrice());
    }
}
