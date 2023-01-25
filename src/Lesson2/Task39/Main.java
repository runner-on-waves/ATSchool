package Lesson2.Task39;

class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Cat cat1 = new Cat();
        System.out.println(cat1);
        Cat cat2 = new Cat(3);
        System.out.println(cat2);
        Cat cat3 = new Cat(4.5);
        System.out.println(cat3);
        Cat cat4 = new Cat("green");
        System.out.println(cat4);
        Cat cat5 = new Cat("green", "white");
        System.out.println(cat5);
        Cat cat6 = new Cat("brown", 1);
        System.out.println(cat6);
        Cat cat7 = new Cat(7, "blue");
        System.out.println(cat7);
        Cat cat8 = new Cat("black", 3.0);
        System.out.println(cat8);
        Cat cat9 = new Cat(2.7, "blue");
        System.out.println(cat9);
        Cat cat10 = new Cat(4.5, 10);
        System.out.println(cat10);
        Cat cat11 = new Cat(7, 3.7);
        System.out.println(cat11);
        Cat cat12 = new Cat("green", "black", 4);
        System.out.println(cat12);
        Cat cat13 = new Cat("blue", "white", 2.9);
        System.out.println(cat13);
        Cat cat14 = new Cat("green", 8, 5.5);
        System.out.println(cat14);
        Cat cat15 = new Cat("grey", 4.2, 6);
        System.out.println(cat15);
        Cat cat16 = new Cat(4, "grey", 3.8, "red");
        System.out.println(cat16);
        Cat cat17 = new Cat("dark-brown", 6, 3.5, "grey");
        System.out.println(cat17);
        Cat cat18 = new Cat(3, 3.8, "blue-yellow", "dark-brown");
        System.out.println(cat18);
        Cat cat19 = new Cat("green", "striped", 8, 4.5);
        System.out.println(cat19);
        Cat cat20 = new Cat("grey", 7, "black", 3.8);
        System.out.println(cat20);
        Cat cat21 = new Cat("green", 2.6, 5, "white");
        System.out.println(cat21);
        Cat cat22 = new Cat("blue", 3.9, "black", 8);
        System.out.println(cat22);
        Cat cat23 = new Cat(3.8, "blue", "black", 7);
        System.out.println(cat23);
        Cat cat24 = new Cat(4.5, 7, "blue", "white");
        System.out.println(cat24);

        //Задание 3. Вызываем статический метод
        System.out.println("Задание 3");
        Animal animal = null;//пример из лекции
        Animal.testStaticMethod();
        Cat.testStaticMethod();
        animal.testStaticMethod();

        //Задание 4. Присваиваем статической переменной новое значение и вызываем у котика(экземпляр класса-наследника Animal)
        System.out.println("Задание 4");
        Animal.setPlanet("Луна");
        System.out.println(cat1.getPlanet());

    }
}