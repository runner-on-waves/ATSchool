package Lesson7.Task6.Assignment1;

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
        // Вывод на печать фруктовой и овощной корзин
        fruitBasket.printBasket();
        vegetableBasket.printBasket();
    }
}
