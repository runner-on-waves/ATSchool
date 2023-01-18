package Lesson2.Task31;

public class Task4 {
    public static void main(String[] args) {
        //Вывод программных аргументов
        System.out.println("Argument count: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
        // Вариант 1. На вход r - целое число
        int p = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        int t = Integer.parseInt(args[2]);
        //В формуле явное приведение процента к double
        System.out.println(p * Math.exp((double) r / 100 * t));
        //Вариант 2. На вход r - дробное чмсло
        double r1 = Double.parseDouble(args[3]);
        System.out.println(p * Math.exp(r1 * t));


    }
}
