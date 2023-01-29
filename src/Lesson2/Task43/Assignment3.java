package Lesson2.Task43;

public class Assignment3 {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        System.out.println("Является ли " + year + " год високосным?");
        if (year > 0 && year < 3000) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        } else {
            System.out.println("Ошибка. Введите корректное значение года в диапазоне от 1 до 3000.");
        }
    }
}
