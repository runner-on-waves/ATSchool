package Lesson4.Assignment1;

public class Program {
    public static void main(String[] args) {

        checkParams(args);
        String param = args[0];
        int[] numbers = createIntArray(args);
        System.out.println("Вывод:");
        printArray(numbers);
        Function object = makeObjectFromParam(param);
        printArray(applyFunction(numbers, object));

    }

    public static int[] applyFunction(int[] numbers, Function functionParam) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (functionParam == null) {
                System.exit(-1);
            }
            result[i] = functionParam.evaluate(numbers[i]);
        }
        return result;
    }

    public static void checkParams(String[] args) {
        if (args.length == 0) {
            System.out.println("Аргументы не переданы");
            System.exit(-1);
        }
        System.out.print("Переданные аргументы: ");
        printArray(args);
        String param = args[0];
        if (isInteger(param)) {//Если первый элемент число, то сообщение об ошибке
            System.out.println("Не передано название операции");
            System.exit(-1);
        }
        if (args.length == 1) {//Проверка что есть аргументы кроме параметра
            System.out.println("Не переданы числа для операции");
            System.exit(-1);
        }
    }

    public static int[] createIntArray(String[] args) {
        int[] numbers = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            try {
                numbers[i - 1] = Integer.parseInt(args[i]);
            } catch (Exception e) {
                System.out.println("Не переданы числа для операции");
                System.exit(-1);
            }
        }
        return numbers;
    }

    public static Function makeObjectFromParam(String param) {
        Function objectFromParam = null;
        switch (param) {
            case "Double":
                objectFromParam = new Double();
                break;
            case "Half":
                objectFromParam = new Half();
                break;
            case "Square":
                objectFromParam = new Square();
                break;
            case "Exact":
                objectFromParam = new Exact();
                break;
            case "Wave":
                objectFromParam = new Function() { // анонимный класс
                    int buffer = 0;

                    @Override
                    public int evaluate(int number) {//у класса Exact метод evaluate возвращет параметр без изменения
                        int bufferInternal = buffer;
                        buffer = number;
                        return number + bufferInternal;
                    }
                };
                break;
            case "SquareEven":
                objectFromParam = ((int number) -> number % 2 == 0 ? number * number : number);
                break;
            default:
                System.out.print("Операция " + param + " не поддерживается.");
                break;
        }
        return objectFromParam;
    }

    public static void printArray(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println(" ");
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
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
