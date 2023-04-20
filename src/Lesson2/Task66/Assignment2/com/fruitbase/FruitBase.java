package Lesson2.Task66.Assignment2.com.fruitbase;

import Lesson2.Task66.Assignment2.com.fruitbase.fruits.Fruit;

import java.io.*;

public class FruitBase implements Serializable {
    private static final long serialVersionUID = 2L;//уникальный идентификатор версии сериализованного класса
    private FruitCatalogue fruitList;

    FruitBase() {
        fruitList = new FruitCatalogue();
    }

    public Delivery takeOrder(String[] order) {
        Delivery delivery = new Cargo();

        for (String s : order) {
            Fruit fruit = fruitList.findFruit(s);
            if (fruit != null) {
                delivery.addFruit(fruit);
            }
        }
        return delivery;
    }

    public void exportCatalogue(String path) throws IOException, RuntimeException {
        FileOutputStream outputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(fruitList);
        objectOutputStream.close();
        System.out.println("Каталог экспортирован " + path);
    }

    public void importCatalogue(String path) throws IOException, RuntimeException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        fruitList = (FruitCatalogue) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("Каталог импортирован " + path);
    }

    @Override
    public String toString() {
        return "FruitBase{" +
                "fruitList=" + fruitList +
                '}';
    }
}
