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

    //заготовка метода
    public Fruit[] getFruits() {
        //с его помощью покупатели получают фрукты из груза
        //      возвращает список фруктов
        return foundFruits;
    }

    //заготовка метода
    public void removeFruit(Fruit fruit) {
        for (int i = 0; i < foundFruits.length; i++) {
            if (fruit.equals(foundFruits[i])) {
                Fruit[] arrayCopy = foundFruits;
                foundFruits = new Fruit[arrayCopy.length - 1];// резервируем место
                System.arraycopy(arrayCopy, 0, foundFruits, 0, i);
                System.arraycopy(arrayCopy, i + 1, foundFruits, i, arrayCopy.length - i - 1);
                break;
            }
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        Fruit[] currentCargoFruits = this.getFruits();
        for (Fruit currentCargoFruit : currentCargoFruits) {
            s.append(currentCargoFruit.getName()).append(" ");
        }
        String weight = String.format("%.2f", this.getWeight());
        return "Информация о грузе(" +currentCargoFruits.length + "): " + s + "\n" +
                "Вес: " + weight + "  " + "Цена: " + this.getPrice();
    }

}
