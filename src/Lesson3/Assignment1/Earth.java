package Lesson3.Assignment1;

public class Earth extends NatureElement {
    @Override
    NatureElement connect(NatureElement element) {
        if (element instanceof Earth) {
            System.out.println("Earth + Earth = Pressure");
            return new Pressure();
        }
        if (element instanceof Air) {
            System.out.println("Earth + Air = Dust");
            return new Dust();
        }
        if (element instanceof Fire) {
            System.out.println("Earth + Fire = Lava");
            return new Lava();
        }
        if (element instanceof Water) {
            System.out.println("Earth + Water = Mud");
            return new Mud();
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
