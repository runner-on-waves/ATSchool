package Lesson7.Task6.Assignment3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        Map<String, Plant> plantMap = convertArrayListToHashMap(plants);
        printPlants(plantMap);
    }

    private static HashMap<String, Plant>
    convertArrayListToHashMap(ArrayList<Plant> arrayList) {

        HashMap<String, Plant> hashMap = new HashMap<>();

        for (Plant plant : arrayList) {

            hashMap.put(plant.getName(), plant);
        }
        return hashMap;
    }

    public static void printPlants(Map<String, Plant> plants) {
        plants.forEach((k, v) -> {
            System.out.format("%s %s%n", k, v.getClass().getSimpleName());
        });
    }
}
