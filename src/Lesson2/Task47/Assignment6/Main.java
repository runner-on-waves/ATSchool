package Lesson2.Task47.Assignment6;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int x = Integer.parseInt(args[0]);
        if (x <= 0) {
            System.out.println("Ошибка. Некорректный ввод для обратного отсчета времени.");
            return;
        }
        Timer timer = new Timer(x);
        timer.start();
    }

}

