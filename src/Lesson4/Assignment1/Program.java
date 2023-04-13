package Lesson4.Assignment1;
public class Program {
    public static void main(String[] args) {

        System.out.print("Переданные аргументы: ");
        printArray(args);
        String param = args[0];
        if (isInteger(param)) {//Если первый элемент число, то сообщение об ошибке
            System.out.println("Не передано название операции");
            System.exit(-1);
        }
        int[] numbers = new int[args.length - 1]; //создаем массив для числовых аргументов

        for (int i = 1; i < args.length; i++) {//как исправить чтобы ходило по массиву?
            try {
                numbers[i - 1] = Integer.parseInt(args[i]);
            } catch (Exception e) {
                System.out.println("Не переданы числа для операции");
                System.exit(-1);
            }
        }
        System.out.println("Вывод:");
        if (param.equals("Double")) {
            printArray(numbers);
            Function doubleParam = new Double();
            printArray(applyFunction(numbers, doubleParam));
        } else if (param.equals("Half")) {
            Function halfParam = new Half();
            printArray(applyFunction(numbers, halfParam));
        } else if (param.equals("Square")) {
            Function squareParam = new Square();
            printArray(applyFunction(numbers, squareParam));
        } else if (param.equals("Exact")) {
            Function exactParam = new Exact();
            printArray(applyFunction(numbers, exactParam));
        } else {
            System.out.println("Вывод: Операция " + param + " не поддерживается.");
        }
    }

    public static int[] applyFunction(int[] numbers, Function functionParam) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = functionParam.evaluate(numbers[i]);
        }
        return result;
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public static boolean isInteger(String param) {
        try {
            Integer.parseInt(param);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
