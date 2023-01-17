package Lesson2.Task31;

public class Task3 {
    public static void main(String[] args) {
        //Вывод программных аргументов
        System.out.println("Argument count: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
        //Получаем значения из иассива строк и парсим в int для расчетов
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int a1 = Integer.parseInt(args[2]);
        int b1 = Integer.parseInt(args[3]);
        System.out.println(a % b == 0 ? "true" : "false");
        System.out.println(a1 % b1 == 0 ? "true" : "false");
    }
}
