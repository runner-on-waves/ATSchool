package Lesson7.Task6.Assignment2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Basket<T> {
    private Map<T, T> basket = new HashMap();

    void addItem(T key) {
        basket.put(key, null);
    }

    public Iterator<T> iterator() {
        return basket.keySet().iterator();
    }
}