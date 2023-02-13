package Lesson2.Task54;

public class Assignment5 {
    public static void main(String[] args) {
        String input = args[0];
        System.out.println("Входная строка: " + input);
        if (isInteger(input)) {
            System.out.println("Строка является целым числом");
        } else {
            System.out.println("Строка не является целым числом");
        }
        if (isDouble(input)) {
            System.out.println("Строка является дробным числом");
        } else {
            System.out.println("Строка не является дробным числом");
        }
    }
    static boolean isInteger(String str) {
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (!Character.isDigit(symbol)) {
                return false;
            }
        }
        return true;
    }
    // дополнительный метод на проверку является ли вводимая строка дробным числом с regexp
    static boolean isDouble(String str) {
            if (!str.matches("[+-]?\\d+(.\\d+)?") && !str.matches("[+-]?\\d+(,\\d+)?")) {
                return false;
            }
        return true;
    }

}
