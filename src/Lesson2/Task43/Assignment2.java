package Lesson2.Task43;

public class Assignment2 {
    public static void main(String[] args) {
        int dayOfWeek = Integer.parseInt(args[0]);

        switch (dayOfWeek) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Ошибка. Введено недопустимое значение. Диапазон допустимых значений от 1 до 7");
        }
    }
}
