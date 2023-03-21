package Lesson2.Task58;

import java.util.Arrays;

import static Lesson2.Task58.Assignment1.*;

public class Assignment4 {
    public static void main(String[] args) {
        int[] inputArray = new int[19];
        fillArray(inputArray);
        System.out.print("Исходный массив: ");
        printArray(inputArray);
        System.out.println("Медиана: " + median(inputArray));
        System.out.print("Массив после вычисления медианы: ");
        printArray(inputArray);
    }

    static int median(int[] array) {
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayCopy);
        int index = arrayCopy.length - 1;
        if (array.length % 2 == 0) {
            return (arrayCopy[index / 2] + arrayCopy[index / 2 + 1]) / 2;
        } else {
            return arrayCopy[index / 2];
        }
    }
}
