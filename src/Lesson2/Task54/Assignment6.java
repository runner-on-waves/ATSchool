package Lesson2.Task54;

public class Assignment6 {
    public static void main(String[] args) {
        String input = args[0];
        System.out.println("Строка на входе: " + input);
        System.out.println("Получено число из строки: " + toInt(input));
        System.out.println("Умножаем полученное число на 2: " + (long) toInt(input) * 2);
    }

    //метод для исключения лидирующих нулей
    static String skipLeadingZeros(String input) {
        for (int i = 0; i < input.length(); ++i) {
            if (input.charAt(i) != '0') {
                return input.substring(i);//возвращаем подстроку с i-го элемента, который не равен нулю
            }
        }
        return "";
    }

    static int toInt(String str) {
        //заводим строку для возможного знака
        skipLeadingZeros(str);
        long number = 0; // так как есть риск при сборке числа выйти за пределы int, а проверка позже, то заводим long
        boolean isMinus = false; // флаг знака -
        int i = 0;

        if (str.charAt(0) == '-') {
            isMinus = true;
            i = 1;
        }

        for (; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (Character.isDigit(symbol)) {
                number = number * 10 + Character.getNumericValue(symbol); // сборка числа
                if (number > Integer.MAX_VALUE || number < Integer.MIN_VALUE) { // проверка, что число не выходит за пределы int
                    System.out.println("Слишком большое число для типа int");
                    System.exit(-1); // Правильно ли так делать?
                }
            } else {
                System.out.println("Ошибка, не может быть преобразовано к числу");
                System.exit(-1);
            }
        }
        if (isMinus) {
            number = -number;
        }
        return (int) number;
    }

}