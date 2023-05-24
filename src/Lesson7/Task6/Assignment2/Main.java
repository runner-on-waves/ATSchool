package Lesson7.Task6.Assignment2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Basket<Fruit> fruitBasket = new Basket<>();
        Basket<Vegetable> vegetableBasket = new Basket<>();
        Fruit banana = new Banana("банан");
        Fruit apple = new Apple("яблоко");
        Vegetable tomato = new Tomato("помидор");
        Vegetable cucumber = new Cucumber("огурец");
        fruitBasket.addItem(apple);
        fruitBasket.addItem(banana);
        //fruitBasket.addItem(cucumber); не получится положить огурец в фруктовую корзину
        vegetableBasket.addItem(tomato);
        vegetableBasket.addItem(cucumber);
        //vegetableBasket.addItem(banana); не получится положить банан в овощную корзину
        System.out.println("Фруктовый салат");
        makeSalad(fruitBasket);
        System.out.println("Овощной салат");
        makeSalad(vegetableBasket);
    }

    public static void makeSalad(Basket<? extends Plant> basket) {
        System.out.println("Готовим салатик: ");
        System.out.println("Режем ");
        Iterator<? extends Plant> list = basket.iterator();
        while (list.hasNext()) {
            System.out.println(list.next().getName());

        }
        System.out.println("Угощайся!");

    }
}
