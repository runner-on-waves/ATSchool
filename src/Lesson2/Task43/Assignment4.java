package Lesson2.Task43;

public class Assignment4 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        double sqa = Math.pow(a, 2);
        double sqb = Math.pow(b, 2);
        double sqc = Math.pow(c, 2);

        System.out.println("Даны три числа: " + a + ", " + b + ", " + c);
        //c if
        if (a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0) {
            System.out.print("Введенные числа являются треугольником. Тип треугольника: ");
            if (sqa == sqb + sqc ||
                    sqb == sqc + sqa ||
                    sqc == sqa + sqb) {
                System.out.println("right");
            } else if (sqa > sqc + sqb ||
                    sqb > sqa + sqc ||
                    sqc > sqa + sqb) {
                System.out.println("acute");
            } else if (sqa < sqc + sqb ||
                    sqb < sqa + sqc ||
                    sqc < sqa + sqb) {
                System.out.println("obtuse");
            }
        } else {
            System.out.println("Введенные числа не являются треугольником: impossible");
        }
    }

}
