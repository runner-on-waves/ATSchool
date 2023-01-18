package Lesson2.Task31;

public class Task2 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        //1. Для обмена целочисленных переменных алгоритм обмена при помощи исключающего ИЛИ
        a = a ^ b ^ (b = a);
        System.out.println("a = " + a + "\n" +
                "b = " + b);
        //2. Способ арифметический
        //Переприсвоим первоначальные значения
        a = 4;
        b = 5;
        a = a + b - (b = a);
        System.out.println("a = " + a + "\n" +
                "b = " + b);
    }
}
