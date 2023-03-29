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

}
