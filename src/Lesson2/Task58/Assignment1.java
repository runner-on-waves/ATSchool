package Lesson2.Task58;

public class Assignment1 {
    public static void main(String[] args) {
        int[] array = new int[20];
        fillArray(array);
        printArray(array);
    }

    static void fillArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = randomNumber(-9,9);
        }
    }
    static int randomNumber(int min, int max){
        return min + (int) (Math.random() * ((max - min) + 1));
    }
    static void printArray(int[] a) {
        StringBuilder result = new StringBuilder();
        for (int i : a) {
            result.append(i).append(" ");
        }
        System.out.println(result);
    }
}
