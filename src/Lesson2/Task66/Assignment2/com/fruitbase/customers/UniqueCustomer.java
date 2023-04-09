package Lesson2.Task66.Assignment2.com.fruitbase.customers;

import Lesson2.Task66.Assignment2.com.fruitbase.Cargo;
import Lesson2.Task66.Assignment2.com.fruitbase.fruits.Fruit;

public class UniqueCustomer extends Customer {
    public UniqueCustomer(String name) {
        super(name);
    }

    @Override
    public void takeFruits(Cargo cargo) {
        //выбирает только уникальные фрукты
        Fruit[] currentCargoFruits = cargo.getFruits();
        for (Fruit fruit : currentCargoFruits) {
            boolean fruitFound = false;
            for (Fruit purchase : purchases) {
                if (fruit.equals(purchase)) {
                    fruitFound = true;
                    break;
                }
            }
            if (!fruitFound) {
                Fruit[] arrayCopy = purchases;
                purchases = new Fruit[arrayCopy.length + 1]; // резервируем место
                System.arraycopy(arrayCopy, 0, purchases, 0, arrayCopy.length);
                purchases[purchases.length - 1] = fruit;
                cargo.removeFruit(fruit);
            }
        }
    }

}