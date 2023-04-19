package Lesson3.Assignment1;

public class Energy extends NatureElement {
    NatureElement connect(NatureElement element) {
        if (element instanceof Water) {
            System.out.println("Energy + Water = Steam");
            return new Steam();
        } else throw new UnsupportedOperationException();
    }
}
