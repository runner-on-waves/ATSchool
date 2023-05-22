package Lesson2.Task66.Assignment2.com.fruitbase;

import Lesson2.Task66.Assignment2.com.fruitbase.fruits.*;

import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;

public class FruitCatalogue implements Serializable {
    private Fruit[] fruits;
    private static final long serialVersionUID = 1L;//уникальный идентификатор версии сериализованного класса

    FruitCatalogue() {
        //Для проверки сериализации/десериализации 2 версии каталога
       /*fruits = new Fruit[]{new Apple("apple", 0.4, new BigDecimal("20.00")),
                new Orange("orange", 0.4, new BigDecimal("20.00")),
                new Banana("banana", 0.4, new BigDecimal("20.00")),
                new Pineapple("pineapple", 0.4, new BigDecimal("0.00"))
        };*/

        fruits = new Fruit[]{new Apple("apple", 0.7, new BigDecimal("50.00")),
                new Orange("orange", 0.7, new BigDecimal("50.00")),
                new Banana("banana", 0.7, new BigDecimal("50.00")),
                new Pineapple("pineapple", 0.7, new BigDecimal("50.00")),
                new Fruit("mango", 0.7, new BigDecimal("50.00")) {
                },
                new Fruit("kiwi", 0.7, new BigDecimal("10.00")) {
                }
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

    @Override
    public String toString() {
        return "FruitCatalogue{" +
                "fruits=" + Arrays.toString(fruits) +
                '}';
    }
}
