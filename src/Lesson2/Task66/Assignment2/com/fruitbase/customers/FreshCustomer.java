package Lesson2.Task66.Assignment2.com.fruitbase.customers;

import Lesson2.Task66.Assignment2.com.fruitbase.Cargo;
import Lesson2.Task66.Assignment2.com.fruitbase.fruits.Fruit;

public class FreshCustomer extends Customer {
    public FreshCustomer(String name) {
        super(name);
    }

    @Override
    public void takeFruits(Cargo cargo) {
        //выбирает только свежие фрукты
        Fruit[] currentCargoFruits = cargo.getFruits();
        for (Fruit fruit : currentCargoFruits) {
            if (fruit.isFresh()) {
                Fruit[] arrayCopy = purchases;
                purchases = new Fruit[arrayCopy.length + 1]; // резервируем место
                System.arraycopy(arrayCopy, 0, purchases, 0, arrayCopy.length);
                purchases[purchases.length - 1] = fruit;
                cargo.removeFruit(fruit);
            }
        }

    }
}