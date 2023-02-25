package Lesson2.Task66.Assignment2.com.fruitbase;

import Lesson2.Task66.Assignment2.com.fruitbase.fruits.Fruit;

import java.math.BigDecimal;

public class Cargo {
    private Fruit[] foundFruits;

    Cargo() {
        foundFruits = new Fruit[0];
    }

    public double getWeight() {
        double sum = 0;
        for (Fruit foundFruit : foundFruits) {
            sum = sum + foundFruit.getWeight();
        }
        return sum;
    }

    public BigDecimal getPrice() {
        BigDecimal totalPrice = new BigDecimal(0);
        for (Fruit foundFruit : foundFruits) {
            totalPrice = totalPrice.add(foundFruit.getPrice());
        }
        return totalPrice;
    }

    void addFruit(Fruit fruit) {
        Fruit[] arrayCopy = foundFruits;
        foundFruits = new Fruit[arrayCopy.length + 1]; // резервируем место
        foundFruits[foundFruits.length - 1] = fruit;
        System.arraycopy(arrayCopy, 0, foundFruits, 0, arrayCopy.length);
    }

}
