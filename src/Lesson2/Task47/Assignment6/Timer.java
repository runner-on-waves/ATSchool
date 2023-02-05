package Lesson2.Task47.Assignment6;

public class Timer {

    public int seconds;
    Timer(int seconds) {
        this.seconds = seconds;
    }

    static void waitSecond(long nextMillis) {
        while (nextMillis > System.currentTimeMillis()) {
        }
    }

    void printTime() {
        int currentMinute = this.seconds / 60;
        int currentSecond = this.seconds % 60;
        if (currentMinute < 10) {
            System.out.print("0" + currentMinute + ":");
        } else {
            System.out.print(currentMinute + ":");
        }
        if (currentSecond < 10) {
            System.out.println("0" + currentSecond);
        } else {
            System.out.println(currentSecond);
        }

    }

    void start() {
        long nextMillis = System.currentTimeMillis();
        printTime();
        while (seconds > 0) {
            nextMillis += 1000;
            waitSecond(nextMillis);
            seconds--;
            printTime();
        }
    }
}
