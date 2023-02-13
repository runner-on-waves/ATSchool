package Lesson2.Task54;

public class Assignment4 {
    public static void main(String[] args) {
        String input = args[0];
        System.out.println("Аргумент на входе: " + input);
        System.out.println("Вывод: " + deleteSymbols(input));
    }

    static String deleteSymbols(String input) {
        StringBuilder res = new StringBuilder(input);
        for (int i = 0; i < res.length(); ) {
            char symbol = res.charAt(i);
            if (!Character.isDigit(symbol)) {
                res.delete(i, i + 1);
            } else {
                i++;
            }
        }
        return res.toString();
    }
}
