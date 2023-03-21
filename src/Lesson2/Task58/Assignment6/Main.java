package Lesson2.Task58.Assignment6;


public class Main {
    public static void main(String[] args) {

        //1 Вариант первый для создания объекта с конструктором, использующим массив
        int[] arrayFromArgs = new int[args.length];
        for (int i = 0; i < args.length; i++) { //получаем массив целочисленных значений из командной строки
            arrayFromArgs[i] = (Integer.parseInt(args[i]));
        }
        DynamicArray newArray = new DynamicArray(arrayFromArgs);
        System.out.println(newArray);

        //2 Вариант с использованием конструктора с длиной массива в параметрах и поэлементным добавлением
        DynamicArray newArray1 = new DynamicArray(0);//создаем массив с 0 длиной
        for (String arg : args) { //получаем массив целочисленных значений из командной строки
            newArray1.add(Integer.parseInt(arg));
        }
        System.out.println(newArray1);
        //Создаем второй объект из первого и выводим на печать
        int length = newArray1.getActualSize();
        DynamicArray newArray2 = new DynamicArray(newArray1.get(0, length));
        System.out.println(newArray2);
        //Удаляем элемент под номером n
        newArray2.delete(3);
        //Печатаем первый объект
        System.out.println(newArray1);
        //Печатаем второй объект
        System.out.println(newArray2);
        //Получаем элемент под номером n
        System.out.println(newArray2.getAt(2));
        // Удаляем все элементы из второго объекта
        newArray2.deleteAll();
        System.out.println(newArray2);
    }
}
