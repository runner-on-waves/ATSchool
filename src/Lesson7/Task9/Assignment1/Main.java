package Lesson7.Task9.Assignment1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Plant> plants = new ArrayList<>();
        Fruit banana = new Banana("banana");
        Fruit apple = new Apple("apple");
        Vegetable tomato = new Tomato("tomato");
        Vegetable cucumber = new Cucumber("cucumber");
        plants.add(banana);
        plants.add(apple);
        plants.add(tomato);
        plants.add(cucumber);
        ArrayList<Fruit> multifruit = new ArrayList<>();
        plants.stream()
                .filter(n -> n instanceof Fruit)
                .map(s -> (Fruit) s)
                .collect(Collectors.toCollection(() -> multifruit))
                .forEach(System.out::println);
    }

}
