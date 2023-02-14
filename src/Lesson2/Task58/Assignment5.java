package Lesson2.Task58;
import java.util.Arrays;

public class Assignment5 {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[5][];
        fillArray(jaggedArray);
        System.out.println("До сортировки: ");
        printTwoDimensionArray(jaggedArray);
        arraySort(jaggedArray);
        System.out.println("После сортировки:");
        printTwoDimensionArray(jaggedArray);
    }

    static void fillArray(int[][] a) { // метод для заполнения двумерного массива
        for (int i = 0; i < a.length; i++) {
            int randomLength = randomNumber(1, 7);
            a[i] = new int[randomLength];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = randomNumber(-9, 9);
            }
        }
    }

    static void arraySort(int[][] array) { // сортировка массива по сумме элементов пузырьком в убывающем порядке
        boolean isSorted = false;
        int[] buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (calculateSum(array[i]) < calculateSum(array[i + 1])) {
                    isSorted = false;
                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }
            }
        }
    }

    static int calculateSum(int[] a) {//метод расчета сумм элементов массива
        int sum = 0;
        for (int j : a) {
            sum = sum + j;
        }
        return sum;
    }

    static int randomNumber(int min, int max) {//метод получения рандомного числа в диапазоне от min до max включительно
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    static void printTwoDimensionArray(int[][] a) {//метод для печати двумерного массива
        for (int[] element : a) {
            System.out.println(Arrays.toString(element));
        }
    }
}




