package Lesson2.Task58;

public class Assignment2 {
    public static void main(String[] args) {
        // проверки
        if (args.length == 0) {
            System.out.println("Массив аргументов командной строки пуст");
            return;
        }
        if (!isValidArrayValue(args)) {
            System.out.println("Слова не соответствуют требуемому вводу");
            return;
        }
        printLongestValues(args);
    }

    static void printLongestValues(String[] array) {
        int maxValueLength = findMaxValueLength(array);
        for (String value : array) {
            if (value.length() == maxValueLength) {
                System.out.print(value + " ");
            }
        }
    }

    static boolean isValidArrayValue(String[] array) {
        for (String s : array) {
            if (!s.matches("^[a-z0-9]*$")) {
                return false;
            }
        }
        return true;
    }

    static int findMaxValueLength(String[] array) { // метод нахождения максимальной строки в массиве
        int maxLength = 0;
        int index;
        for (String s : array) {
            index = s.length();
            if (maxLength <= index) {
                maxLength = index;
            }
        }
        return maxLength;
    }
}
