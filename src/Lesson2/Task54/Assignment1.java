package Lesson2.Task54;

public class Assignment1 {
    public static String str = "Циклом называется многократное выполнение одних и тех же действий. ";

    public static void main(String[] args) {
        String programArg = args[0];
        int position = printCharPosition(programArg);
        System.out.println("Через аргументы передается " + "\"" + programArg + "\"" + ",  Вывод: " + position + ".");
    }

    static int printCharPosition(String arg) {
        int index = str.indexOf(arg);
        if (index == -1) {
            System.out.println("Ошибка. Элемент не найден в строке");
            System.exit(-1);
        }
        String subStr = str.substring(0, index);
        subStr = subStr.replaceAll("[\\s.]", "");
        return subStr.length();
    }
}
