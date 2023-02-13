package Lesson2.Task47.Assignment5;

public class Calculator {
    public static void main(String[] args) {
        for (int i = 0; i < args.length - 1; i = i + 3) {
            int x = Integer.parseInt(args[i]);
            String operator = args[i + 1];
            int y = Integer.parseInt(args[i + 2]);
            switch (operator) {
                case "+":
                    System.out.println(x + " " + operator + " " + y + " = " + add(x, y));
                    break;
                case "-":
                    System.out.println(x + " " + operator + " " + y + " = " + sub(x, y));
                    break;
                case "*":
                    System.out.println(x + " " + operator + " " + y + " = " + mult(x, y));
                    break;
                case "/":
                    System.out.println(x + " " + operator + " " + y + " = " + divide(x, y));
                    break;
                default:
                    System.out.println("Была введена неподдерживаемая операция");
                    break;
            }
        }
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int sub(int x, int y) {
        return x - y;
    }

    static int mult(int x, int y) {
        return x * y;
    }

    static int divide(int x, int y) {
        if (y == 0) {
            System.out.println( x + " / " +y + " = Операция не может быть выполнена. Деление на ноль");

            System.exit(0);
        }
        return x / y;
    }
}
