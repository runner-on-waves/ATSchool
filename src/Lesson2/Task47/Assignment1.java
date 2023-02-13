package Lesson2.Task47;

public class Assignment1 {
    public static void main(String[] args) {
        //Получаем переменные m и n из массива строк командной строки и парсим их в int
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int x;
        for (x = m; x <= n; x++) {
            if (x % 3 == 0 && x % 5 != 0) {
                System.out.println("Найдено число x: " + x);
            }
        }
    }
}
