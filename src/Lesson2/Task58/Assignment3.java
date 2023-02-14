package Lesson2.Task58;

import static Lesson2.Task58.Assignment1.*;


public class Assignment3 {
    public static void main(String[] args) {
        int[] inputArray = new int[20];
        fillArray(inputArray); // заполняем массив
        System.out.println("Macсив до сортировки: ");
        printArray(inputArray);
        bubbleSort(inputArray);
        System.out.println("Macсив после сортировки: ");
        printArray(inputArray);
    }

    static void bubbleSort(int[] array) {
        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }
            }
        }
    }
}
