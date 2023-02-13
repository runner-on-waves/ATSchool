package Lesson2.Task54;

public class Assignment3 {
    public static void main(String[] args) {
        String input = args[0];
        System.out.println("Аргумент на входе: " + input);
        System.out.println("Вывод: " + replaceSymbols(input));

    }

    static String replaceSymbols(String input) {
        StringBuilder res = new StringBuilder(input);
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) == '0') {
                res = res.replace(i, i + 1, "1");
            } else if (res.charAt(i) == '1') {
                res = res.replace(i, i + 1, "0");
            }
        }

        return res.toString();
    }
}
