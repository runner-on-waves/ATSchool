package Lesson2.Task75.Assignment1;

public class Assignment1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Ошибка. Введите значения аргументов");
            return;
        }
        System.out.print("Ввод: ");
        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
        String[] result = removeDuplicates(args);
        System.out.print("Вывод: ");
        for (String s : result) {
            System.out.print(s + " ");
        }

    }

    public static String[] removeDuplicates(String[] array) {
        //счетчик дубликатов
        int counter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == null) {
                    break;
                }
                if (array[i].equals(array[j])) {
                    array[j] = null;
                    counter++;
                }
            }
        }
        String[] result = new String[array.length - counter];
        int k = 0;
        for (String s : array) {
            if (s != null) {
                result[k++] = s;
            }
        }
        return result;
    }
}

