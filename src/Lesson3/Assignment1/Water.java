package Lesson3.Assignment1;

public class Water extends NatureElement {
    @Override
    NatureElement connect(NatureElement element) throws UnsupportedOperationException {
        if (element instanceof Water) {
            System.out.println("Water + Water = Sea");
            return new Sea();
        }
        if (element instanceof Fire) {
            System.out.println("Water + Fire = Steam");
            return new Steam();
        }
        if (element instanceof Earth) {
            System.out.println("Water + Earth = Mud");
            return new Mud();
        }
        if (element instanceof Air) {
            System.out.println("Water + Air = Rain");
            return new Rain();
        }
        if (element instanceof Energy) {
            System.out.println("Water + Energy = Steam");
            return new Steam();
        } else {
            throw new UnsupportedOperationException();
        }
    }
}

