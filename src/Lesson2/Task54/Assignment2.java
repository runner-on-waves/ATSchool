package Lesson2.Task54;

public class Assignment2 {
    public static void main(String[] args) {
        String input = args[0];
        if (!isValidPath(input)) {
            System.out.println("Введен некорректный путь до файла.");
            return;
        }
        printPath(input);
    }

    static boolean isValidPath(String path) {
        int index = path.length() - 1;
        char lastSymbol = path.charAt(index);
        if (lastSymbol == '/' || lastSymbol == '\\') {
            return false;
        }
        return true;
    }

    static void printPath(String path) {
        System.out.println("Через аргументы передается \"" + path + "\", выводится:");
        int lastSlashPosition;
        int length = path.length();
        if (path.contains("\\")) {
            lastSlashPosition = path.lastIndexOf("\\") + 1;
        } else if (path.contains("/")) {
            lastSlashPosition = path.lastIndexOf("/") + 1;
        } else {
            System.out.println("Строка не содержит путь");
            return;
        }
        System.out.println("Путь: " + path.substring(0, length - (length - lastSlashPosition)));
        System.out.println("Имя файла: " + path.substring(lastSlashPosition, length));
    }
}
