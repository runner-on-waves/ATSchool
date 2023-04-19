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

    public void exportCatalogue(String path) throws Exception {
        String exportPath = "C:\\javaHomework\\Lesson3\\save.ser";
        if (!path.equals("")) {
            exportPath = path;
        }
        try (FileOutputStream outputStream = new FileOutputStream(exportPath)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(fruitList);
            objectOutputStream.close();
        }  catch (Exception e) {
            throw e;
        }
        System.out.println("Каталог экспортирован " + exportPath);
    }

    public void importCatalogue(String path) throws Exception {
        String importPath = "C:\\javaHomework\\Lesson3\\save.ser";
        if (!path.equals("")) {
            importPath = path;
        }
        try (FileInputStream fileInputStream = new FileInputStream(importPath)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            fruitList = (FruitCatalogue) objectInputStream.readObject();
            System.out.println("Каталог импортирован " + importPath);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public String toString() {
        return "FruitBase{" +
                "fruitList=" + fruitList +
                '}';
    }
}
