package Lesson2.Task31;

public class Task1 {
    public static void main(String[] args) {
        changeVariables(10, 25);
    }

    public static void changeVariables(int a, int b) {
        int buffer;
        buffer = a;
        a = b;
        b = buffer;
        System.out.println("a = " + a + "\n" +
                "b = " + b);
    }
}
