package Lesson2.Task43;

public class Assignment5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]); // цена товара в рублях
        int b = Integer.parseInt(args[1]); // цена товара в копейках
        int c = Integer.parseInt(args[2]); // оплаченная сумма в рублях
        int d = Integer.parseInt(args[3]); // оплаченная сумма в копейках
        System.out.println("Цена товара - " + a + " рублей и " + b + " копеек.");
        System.out.println("Покупатель оплатил - " + c + " рублей и " + d + " копеек.");
        int price = a * 100 + b;
        int sumPayed = c * 100 + d;

        if (price <= sumPayed && a >= 0 && b >= 0 && c >= 0 && d >= 0) {
            countChange(price, sumPayed);
        } else {
            System.out.println("Значения некорректны. Расчет сдачи невозможен.");
        }
    }

    static void countChange(int price, int sumPayed) {
        int change = sumPayed - price;
        int e = change / 100;
        int f = change % 100;
        System.out.println("Сдача составит - " + e + " рублей и " + f + " копеек.");
    }
}
