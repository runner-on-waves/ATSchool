package Lesson2.Task75.Assignment3;

public class Main {
    public static void main(String[] args) {
        int l = 1;//количество итераций; Значение Element number+l
        int n = 10; //При маленьком количестве элементов сообщения с finalize не выводятся
        int m = 5;// число элементов не равных null в массиве
        //1. Создаем массив с n элементов
        for (int k = 0; k < l; k++) {
            System.out.println("Номер итерации " + (k + 1));
            Element[] elements = new Element[n];
            for (int i = 0; i < n; i++) {
                Element element = new Element();
                elements[i] = element;
                int counter = elements[i].getCounter();
                element.setNumber(i + l);
            }
            int counter = 0;
            for (Element element : elements) {

                if (element == null) {
                    counter++;
                }

            }
            System.out.println("Длина массива: " + elements.length + ", количество пустых элементов " + counter);
            int counterList = elements.length;
            while (counterList > m) {
                int elementForRemoving = nextInt(n - 1);
                if (elements[elementForRemoving] != null) {
                    elements[elementForRemoving] = null;
                    counterList--;
                }
            }
            counter = 0;
            for (Element element : elements) {

                if (element == null) {
                    counter++;
                }

            }
            System.out.println("Длина массива: " + elements.length + ", количество пустых элементов " + counter);
            System.out.println("Количество финализаций на момент завершения итераций " + Element.counterFinalize);
            //System.gc(); //4 если закомментировать сообщения не выводятся --вызов сборщика мусора
            // System.runFinalization(); // если закомментировать сообщения выводятся --вызов finalize
            //System.out.println("Количество финализаций после принудительной сборки мусора " + Element.counterFinalize);
        }
        System.gc(); // если закомментировать сообщения выводятся
        System.runFinalization(); // если закомментировать сообщения не выводятся
        System.out.println("Количество финализаций после принудительной сборки мусора " + Element.counterFinalize);
    }

    static int nextInt(int x) {
        return (int) (Math.random() * x);
    }

}
