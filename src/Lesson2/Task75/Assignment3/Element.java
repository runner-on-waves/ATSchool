package Lesson2.Task75.Assignment3;

public class Element {
    private int number;
    private int counter;
    public static int counterFinalize = 0;

    public Element() {
        number = 1;
    }

    public int getNumber() {
        return number;
    }

    public int getCounter() {
        return counter;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        counterFinalize++;
        System.out.println("Finalize " + this.number);
    }

    @Override
    public String toString() {
        return "Element " +
                "number = " + number
                ;
    }
}
