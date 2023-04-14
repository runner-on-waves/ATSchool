package Lesson2.Task66.Assignment2.com.fruitbase;

import Lesson2.Task66.Assignment2.com.fruitbase.fruits.Fruit;

import java.io.*;

public class FruitBase implements Serializable {
    private static final long serialVersionUID = 1L;//уникальный идентификатор версии сериализованного класса
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

    public void exportCatalogue() {
        String exportPath = "C:\\javaHomework\\Lesson3\\save.ser";
        try (FileOutputStream outputStream = new FileOutputStream(exportPath)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(fruitList);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Каталог экспортирован " + exportPath);
    }

    public void importCatalogue() {
        String importPath = "C:\\javaHomework\\Lesson3\\save.ser";
        try (FileInputStream fileInputStream = new FileInputStream(importPath)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            fruitList = (FruitCatalogue) objectInputStream.readObject();
            System.out.println("Каталог импортирован " + importPath);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "FruitBase{" +
                "fruitList=" + fruitList +
                '}';
    }
}
