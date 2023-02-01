package Lesson2.Task47;

public class Assignment2 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        if (!(m >= 0 && n > 0)) {
            System.out.println("Некорректный ввод. Поработайте подольше!");
            return;
        }
        System.out.println("Бригада отработала " + calculateWorkTime(m, n) / 60 + " часов " + (calculateWorkTime(m, n) % 60 + " минут"));
    }

    public static int calculateWorkTime(int m, int n) {
        int totalTimeMinutes = 0;
        int workTimeMinutes = m * 60;
        for (int i = 1; i <= n; i++) {
            totalTimeMinutes = totalTimeMinutes + workTimeMinutes;
            workTimeMinutes = workTimeMinutes + 10;
        }
        return totalTimeMinutes;
    }
}


