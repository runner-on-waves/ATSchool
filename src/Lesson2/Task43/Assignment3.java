package Lesson2.Task43;

public class Assignment3 {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        System.out.println("Является ли " + year + " год високосным?");
        if (!(year > 0 && year < 3000)) {
            System.out.println("Ошибка. Введите корректное значение года в диапазоне от 1 до 3000.");
            return;
        }
        if (isLeapYear(year)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

}

