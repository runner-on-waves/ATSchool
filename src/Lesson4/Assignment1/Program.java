package Lesson4.Assignment1;

public class Program {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Аргументы не переданы");
            System.exit(-1);
        }
        System.out.print("Переданные аргументы: ");
        printArray(args);
        String param = args[0];
        int[] numbers = new int[args.length - 1]; //создаем массив для числовых аргументов
        if (isInteger(param)) {//Если первый элемент число, то сообщение об ошибке
            System.out.println("Не передано название операции");
            System.exit(-1);
        }
        if (args.length == 1) {//Проверка что есть аргументы кроме параметра
            System.out.println("Не переданы числа для операции");
            System.exit(-1);
        }
        for (int i = 1; i < args.length; i++) {
            try {
                numbers[i - 1] = Integer.parseInt(args[i]);
            } catch (Exception e) {
                System.out.println("Не переданы числа для операции");
                System.exit(-1);
            }
        }

        System.out.println("Вывод:");
        printArray(numbers);

        switch (param) {
            case "Double":
                Function doubleParam = new Double();
                printArray(applyFunction(numbers, doubleParam));
                break;
            case "Half":
                Function halfParam = new Half();
                printArray(applyFunction(numbers, halfParam));
                break;
            case "Square":
                Function squareParam = new Square();
                printArray(applyFunction(numbers, squareParam));
                break;
            case "Exact":
                Function exactParam = new Exact();
                printArray(applyFunction(numbers, exactParam));
                break;
            case "Wave":
                Function waveParam = new Function() { // анонимный класс
                    int buffer = 0;

                    @Override
                    public int evaluate(int number) {//у класса Exact метод evaluate возвращет параметр без изменения
                        int bufferInternal = buffer;
                        buffer = number;
                        return number + bufferInternal;
                    }
                };
                printArray(applyFunction(numbers, waveParam));
                break;
            case "SquareEven":
                Function squareEvenParam = ((int number) -> number % 2 == 0 ? number * number : number);
                printArray(applyFunction(numbers, squareEvenParam));
                break;
            default:
                System.out.println("Вывод: Операция " + param + " не поддерживается.");
                break;
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
