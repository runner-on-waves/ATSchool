package Lesson2.Task43;

public class Assignment5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);

        if (c >= a && c >= 0 &&
                ((a == 0 && b > 0 && d > 0 && d > b) ||
                (a == 0 && b >= 0 && d >= 0 && d > b))) {
            countChange(a, b, c, d);
        } else {
            System.out.println("Значения некорректны. Расчет сдачи невозможен.");
        }
    }

    static void countChange(int a, int b, int c, int d) {
        double price = a + (double) b / 100;
        double sumPayed = c + (double) d / 100;
        System.out.println("Цена товара - " + a + " рублей и " + b + " копеек.");
        System.out.println("Покупатель оплатил - " + c + " рублей и " + d + " копеек.");
        double change = sumPayed - price;
        int e = (int) change;
        int f = (int) ((change - e) * 100);
        System.out.println("Сдача составит - " + e + " рублей и " + f + " копеек.");

    }
}
