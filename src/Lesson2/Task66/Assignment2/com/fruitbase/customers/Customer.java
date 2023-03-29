package Lesson2.Task66.Assignment2.com.fruitbase.customers;

import Lesson2.Task66.Assignment2.com.fruitbase.Cargo;
import Lesson2.Task66.Assignment2.com.fruitbase.fruits.Fruit;

public abstract class Customer {
    // массив покупок фруктов purchases

    protected String name;
    protected Fruit[] purchases;

    Customer(String name) {
        this.name = name;
        //инициализируется внутренний массив
        purchases = new Fruit[0];

    }

    public abstract void takeFruits(Cargo cargo);// метод принимает груз и сохраняет из него фрукты во внутренний массив, т.е. в грузе объекты заканчиваются

    public void printPurchases() {
        for (Fruit fruit : purchases) {
            System.out.print(fruit.getName() + " ");
        }
        System.out.println();
    }
   @Override
    public String toString(){
        return name;
   }
}
