package Lesson2.Task47;

public class Assignment4 {
    public static void main(String[] args) {
        int n = 100;
        boolean flag = true;
        int buffer;//переменная для рандомного числа
        while (flag) {
            buffer = nextInt(n);
            if (isPrime(buffer)) {
                System.out.println("Найдено простое число - " + buffer);
                break;
            } else System.out.println("Сгенерировано число - " + buffer + ", продолжаем поиск...");
        }
    }
    static boolean isPrime(int x) {
        //число является простым в том случае, если оно целое положительное и без остатка делится на себя и на 1.
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int nextInt(int x) {
        return (int) (Math.random() * x);
    }
}
