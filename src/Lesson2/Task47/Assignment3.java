package Lesson2.Task47;

public class Assignment3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
        if (n < 1 || col <= 0) {
            System.out.println("Ошибка. Неправильные параметры");
            return;
        }
        snakePrint(n, col);
    }

    static void snakePrint(int n, int col) {
        String buffer = ""; // заводим буфер для печати строк
        int k = 0; // переменная для сравнения с col(счетчик количества цифр в строке)
        boolean directionForward = true; // порядок печати цифр прямой/обратный
        for (int i = 1; i <= n; i++) {
            if (directionForward) {
                buffer = buffer + i + " "; // доращиваем строку справа
            } else {
                buffer = i + " " + buffer; // доращиваем строку слева
            }
            k++;
            if (k == col) { //когда собрали полную строку для печати из col элементов
                System.out.println(buffer);
                buffer = "";
                k = 0; // обнуляем счетчик
                directionForward = !directionForward; //меняем направление печати
            }
        }
        if (!buffer.equals("")) { // когда n не кратно col
            System.out.println(buffer); // печатаем остаток неполной строки < col
        }
    }
}

