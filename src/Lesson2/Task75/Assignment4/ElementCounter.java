package Lesson2.Task75.Assignment4;

import java.util.Objects;

public class ElementCounter {
    private String value;
    private int counter;

    public ElementCounter(String input) {
        value = input;
        counter = 1;
    }

    public String getValue() {
        return value;
    }

    public int getCounter() {
        return counter;
    }

    public int inc() {
        return counter++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ElementCounter)) return false;
        ElementCounter that = (ElementCounter) o;
        return getCounter() == that.getCounter() && getValue().equals(that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue(), getCounter());
    }
}
