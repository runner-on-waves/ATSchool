package Lesson4.Assignment3;

public interface Queue {
    void add(int value);// - добавляет целочисленное значение в очередь

    int remove();// - удаляет значение из очереди

    boolean isEmpty();// - возвращает true, если в очереди нет элементов
}

