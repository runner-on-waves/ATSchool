package Lesson4.Assignment3;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[args.length];
        if (args.length == 0) {
            System.out.println("Не переданы аргументы для формирования очереди");
            System.exit(-1);
        }
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (Exception e) {
                System.out.println("Невозможно преобразовать аргументы в числовые значения");
                System.exit(-1);
            }

        }

        System.out.println("Очередь #1:");
        printArray(numbers);
        Queue queueFIFO = new QueueFIFO();
        createQueue(queueFIFO, numbers);
        runQueue(queueFIFO);

        System.out.println("Очередь #2:");
        printArray(numbers);
        Queue queueFIMinO = new QueueFIMinO();
        createQueue(queueFIMinO, numbers);
        runQueue(queueFIMinO);
    }


    public static void createQueue(Queue queue, int[] numbers) {
        for (int number : numbers) {
            queue.add(number);
        }
    }

    public static void runQueue(Queue queue) {
        System.out.println(queue);
        while (!queue.isEmpty()) {
            System.out.println("Удален элемент: " + queue.remove() + ", оставшиеся элементы: " + queue);
        }
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println(" ");
    }
}