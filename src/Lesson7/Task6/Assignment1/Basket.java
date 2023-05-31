package Lesson7.Task6.Assignment1;

import java.util.ArrayList;

public class Basket<T> {
    private ArrayList<T> basket = new ArrayList<>();

    void addItem(T element) {
        basket.add(element);
    }

    public void printBasket() {
        System.out.print("Состав корзины: ");
        StringBuilder result = new StringBuilder();
        if (basket.size() != 0)
            result.append(basket.get(0));
        for (int i = 1; i < basket.size(); i++) {
            result.append(", ").append(basket.get(i));
            System.out.print(result);

        }
        System.out.println("");
    }


}
