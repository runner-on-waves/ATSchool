package Lesson2.Task75.Assignment4;

import static Lesson2.Task75.Assignment4.Assignment1.removeDuplicates;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Ошибка. Введите значения аргументов");
            return;
        }
        System.out.print("Ввод: ");
        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();

        String[] result = removeDuplicates(args);
        System.out.print("Вывод: ");
        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}
