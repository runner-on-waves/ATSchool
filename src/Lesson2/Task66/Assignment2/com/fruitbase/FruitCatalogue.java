package Lesson2.Task66.Assignment2.com.fruitbase;
import Lesson2.Task66.Assignment2.com.fruitbase.fruits.*;
import java.math.BigDecimal;

public class FruitCatalogue {
    private Fruit[] fruits;

    FruitCatalogue() {

        fruits = new Fruit[]{new Apple(0.2, new BigDecimal("20.00"), "apple"),
                new Orange(0.2, new BigDecimal("20.00"), "orange"),
                new Banana(0.2, new BigDecimal("20.00"), "banana"),
                new Pineapple(0.2, new BigDecimal("20.00"), "pineapple")
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
