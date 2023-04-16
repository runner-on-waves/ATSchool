package Lesson4.Assignment3;

import java.util.ArrayList;
import java.util.Collections;

class QueueFIMinO implements Queue {
    private ArrayList<Integer> queueArray = new ArrayList<>();

    @Override
    public void add(int value) {
        queueArray.add(0, value);
    }

    @Override
    public int remove() {
        int minDeleted = Collections.min(queueArray);
        queueArray.remove((Integer) minDeleted);
        return minDeleted;
    }

    @Override
    public boolean isEmpty() {
        return queueArray.size() == 0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        if (queueArray.size() == 0) {
            s.append("элементы отсутствуют");
        } else {
            for (Integer integer : queueArray) {
                s.append(integer).append(" ");
            }
        }
        return s.toString();
    }
}
