package Lesson2.Task66.Assignment2.com.fruitbase;

import Lesson2.Task66.Assignment2.com.fruitbase.fruits.*;

import java.math.BigDecimal;

public class FruitCatalogue {
    private Fruit[] fruits;

    FruitCatalogue() {

        fruits = new Fruit[]{new Apple("apple", 0.2, new BigDecimal("20.00")),
                new Orange("orange", 0.2, new BigDecimal("20.00")),
                new Banana("banana", 0.2, new BigDecimal("20.00")),
                new Pineapple("pineapple", 0.2, new BigDecimal("20.00"))
        };

    }

    Fruit findFruit(String word) {
        for (Fruit fruit : fruits) {
            if (word.equals(fruit.getName())) {
                return fruit;
            }
        }
        return null;
    }
}
