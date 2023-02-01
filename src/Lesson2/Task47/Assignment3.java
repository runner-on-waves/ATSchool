package Lesson2.Task47;

public class Assignment3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
        if (n >= 1 && col > 0) {
            System.out.println("Ошибка. Неправильные параметры");
            return;
        }
        snakePrint(n, col);
    }
    static void snakePrint(int n, int col) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            if (k <= col) {
                System.out.print(i + " ");
                k++;
            } else {
                k = 1;
                System.out.println(i);
            }
        }
    }
}

