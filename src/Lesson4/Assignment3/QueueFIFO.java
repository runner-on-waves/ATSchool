package Lesson4.Assignment3;

import java.util.ArrayList;

public class QueueFIFO implements Queue {
    private ArrayList<Integer> queueArray = new ArrayList<>();

    @Override
    public void add(int value) {
        int position = queueArray.size();
        queueArray.add(position, value);
    }

    @Override
    public int remove() {
        int deletedNumber = queueArray.get(0);
        if (!isEmpty()) {
            queueArray.remove(0);
        }
        return deletedNumber;
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
