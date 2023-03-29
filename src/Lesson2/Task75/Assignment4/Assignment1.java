package Lesson2.Task75.Assignment4;

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
        DynamicElementCounter elementCounter = new DynamicElementCounter(array.length * 2);
        int counter = 0;

        for (int i = 0; i < array.length - 1; i++) {
            // возникает коллизия при расчете позиции вставки элемента,
            // так как элементы с разными строками могут получать одинаковый индекс из-за ограниченного количества элементов внутреннего массива
            elementCounter.put(array[i]);
        }
        String[] result = new String[elementCounter.getUsedSize()];
        int k = 0;
        for (int i = 0; i < elementCounter.getSize(); i++) {
            ElementCounter element = elementCounter.get(i);
            if (element != null) {
                result[k++] = element.getValue();
            }
        }
        return result;
    }
}

