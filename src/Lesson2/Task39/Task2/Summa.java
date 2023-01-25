package Lesson2.Task39.Task2;

public class Summa {

    //Метод, возвращающий сумму int от 2х переменных int
    public int sum(int a, int b) {
        return a + b;
    }

    //Метод, возвращающий сумму double от 3х переменных int
    public double sum(int a, int b, int c) {
        return a + b + c;
    }

    //Метод, возвращающий сумму double от 2х и от 3х переменных double. По факту два метода, так как отличается число параметров в сигнатуре
    public double sum(double x, double y) {
        return x + y;
    }

    public double sum(double x, double y, double z) {
        return x + y + z;
    }

    // Метод, возвращающий сумму double от 1 int и от 2х переменных double
    public double sum(int a, double x, double y) {
        return a + x + y;
    }

    /* Попробовать создать метод возвращающий double из 2х переменных int - метод имеет такую же сигнатуру как и public int sum(int a,int b){}
    public double sum(int a, int b) {
        return a + b;
    }*/

    //Попробовать создать метод возвращающий double из 2х переменных Integer
    public double sum(Integer a, Integer b) {
        return a + b;
    }

    public static void main(String[] args) {
        //Создание объекта класса для вызова метода с дефолтным конструктором
        Summa sum1 = new Summa();
        //Создание локальных переменных для расчетов(необязательно, можно передавать сразу в метод)
        int a = 5;
        int b = 6;
        int c = 7;
        double x = 9.2;
        double y = 11.45;
        double z = 23.6;
        // Вывод значений каждого метода на экран
        System.out.println(sum1.sum(a, b));
        System.out.println(sum1.sum(a, b, c));
        System.out.println(sum1.sum(x, y));
        System.out.println(sum1.sum(x, y, z));
        System.out.println(sum1.sum(a, x, y));
        //Перегруженный метод с Integer в параметрах. Если передавать примитивы, то предпочтение отдается методу с int в параметрах
        Integer a1 = a;
        Integer b1 = b;
        System.out.println(sum1.sum(a1, b1));

    }

}
