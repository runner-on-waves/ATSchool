package Lesson2.Task75.Assignment4;

public class DynamicElementCounter {
    private ElementCounter[] elements;

    DynamicElementCounter(int count) {
        elements = new ElementCounter[count];

    }

    public void put(String... args) {
        if (args.length == 0) return;
        for (String value : args) {
            int position = value.hashCode() % elements.length;
            if (elements[position] == null) {
                elements[position] = new ElementCounter(value);
            } else {
                elements[position].inc();
            }
        }

    }

    public ElementCounter get(int position) {
        if (position >= 0 && position < elements.length) {
            return elements[position];
        } else {
            System.out.println("Недопустимое значение позиции");
            return null;
        }
    }

    public int getSize() {
        return elements.length;
    }

    public int getUsedSize() {
        int size = 0;
        for (ElementCounter element : elements) {
            if (element != null) {
                size++;
            }
        }
        return size;
    }

}
