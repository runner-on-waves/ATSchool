package Lesson2.Task58.Assignment6;

public class DynamicArray {
    private int[] array;

    public int getActualSize() {
        return actualSize;
    }

    private int actualSize;

    public DynamicArray(int[] newArray) {
        array = new int[newArray.length + 10];
        System.arraycopy(newArray, 0, array, 0, newArray.length); // System.arraycopy вроде быстрее
        actualSize = newArray.length;
        //Для отладки
        //System.out.println("DynamicArray по массиву создан");
    }

    public DynamicArray(int newSize) {
        actualSize = newSize;
        array = new int[actualSize+10]; // резервируем место, потенциально можно в конструкторе, для отладки нужно убрать
        //Для отладки
       // System.out.println("DynamicArray с " + actualSize + " нулевых элементов создан");
    }

    //Методы
    //1 Переопределяет метод toString(возвращает строку из всех элементов массива через пробел)
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < actualSize; i++) {
            s.append(array[i]).append(" ");
        }
        return s.toString();
    }

    //2 Добавляет один элемент в конец внутреннего массива
    void add(int x) {
        if (array.length <= actualSize + 1) // расширяем массив
        {
            int[] arrayCopy = array;
            array = new int[arrayCopy.length + 10]; // резервируем место, в данном случае увеличиваем на 10, для отладки шаг+1
            System.arraycopy(arrayCopy, 0, array, 0, arrayCopy.length);
            System.out.println("Внутренний массив расширен Length " + array.length);//Сообщение в случае расширения массива
        }
        array[actualSize] = x;
        actualSize++;
    }

    //3 Добавляет элементы из переданного массива в конец внутреннего
    void add(int[] x) {
        if (array.length <= actualSize + x.length) // расширяем массив
        {
            int[] arrayCopy = array;
            array = new int[arrayCopy.length + x.length + 10]; // резервируем место
            System.arraycopy(arrayCopy, 0, array, 0, arrayCopy.length);
            System.out.println("Внутренний массив расширен Length " + array.length);
        }
        System.arraycopy(x, 0, array, actualSize, x.length);
        actualSize += x.length;
    }

    //4 Получает один элемент массива с позиции n
    int getAt(int n) {
        if (n >= actualSize || n < 0)  // выход за границу массива
        {
            System.out.println("выход за границу массива -  элемент с номером " + n + " не существует");
            return -1;
        }
        return array[n];
    }

    //5 Получает массив элементов с начиная с позиции from до to, не включая
    int[] get(int from, int to) {
        if (from >= actualSize - 1 || from < 0 || to <= from || to > actualSize)  // выход за границу массива
        {
            System.out.println("Выход за границу массива -  диапазон " + from + "-" + to + " не существует");
            return null;
        }
        int[] res = new int[to - from];
        System.arraycopy(array, from, res, 0, to - from);
        return res;
    }

    //6 Удаляет элемент под номером n
    void delete(int n) {
        if (n >= actualSize || n < 0)  // выход за границу массива
        {
            System.out.println("Выход за границу массива -  элемент с номером " + n + " не существует");
            return;
        }
        int[] arrayCopy = array;
        array = new int[arrayCopy.length]; // резервируем место
        System.arraycopy(arrayCopy, 0, array, 0, n);
        System.arraycopy(arrayCopy, n + 1, array, n, arrayCopy.length - n - 1);
        actualSize--;
        System.out.println("Элемент с номером " + n + " удален");

    }

    //7 Удаляет все элементы
    void deleteAll() {
        array = new int[array.length]; // резервируем место
        actualSize = 0;
        System.out.println("Массив очищен");
    }
}
