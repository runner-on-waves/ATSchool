package Lesson3.Assignment1;

import static Lesson3.Assignment1.NatureElement.create;

public class Alchemy {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Нет элементов для соединения");
            return;
        }
        if (args.length == 1) {
            System.out.println("Нельзя создать производный элемент. Не хватает материалов.Базовый элемент: " + create(args[0]).getClass().getSimpleName());
            return;
        }
        NatureElement[] elementsArray = new NatureElement[args.length];
        for (int i = 0; i < args.length; i++) {
            String elementName = args[i];
            try {
                elementsArray[i] = NatureElement.create(elementName);
            } catch (java.util.NoSuchElementException e) {
                System.out.println("Неизвестный элемент: " + args[i]);
                System.exit(-1);
            }
            if (args[i] == null) {
                System.out.println("Неверные названия элементов: " + args[i]);
                return;
            }
        }

        for (int k = 0; k < elementsArray.length; k = k + 2) {
            if (k + 1 < elementsArray.length) {
                NatureElement composedNatureElement = null;
                if (elementsArray[k] != null) {
                    try {
                        composedNatureElement = elementsArray[k].connect(elementsArray[k + 1]);
                        System.out.println("Создан производный элемент " + composedNatureElement.getClass().getSimpleName() + "\n");
                    } catch (UnsupportedOperationException e) {
                        System.out.println("Неподдерживаемая операция. Нельзя создать производный элемент: "
                                + elementsArray[k].getClass().getSimpleName() + " + "
                                + elementsArray[k + 1].getClass().getSimpleName());
                    }
                }
            } else {
                System.out.println("Нельзя создать производный элемент. Не хватает материалов.Базовый элемент: " + elementsArray[k].getClass().getSimpleName() + " + ?");
            }
        }

    }

}

/* Проверки. Данные в аргументах командной строки
1. 0 аргументов ОР: Ошибка "нет элементов для соединения"
2. 1 валидный аргумент ОР: Ошибка Нельзя создать производный элемент
3. 1 невалидный аргумент ОР: "Аргумент не соответствует названию базового элемента"
4. валидные и невалидные аргументы ОР: "Аргумент не соответствует названию базового элемента"
5. валидные аргументы(четное количество) ОР: Выведены формулы и класс производного элемента
6. валидные аргументы(нечетное количество) ОР: Выведены формулы и класс производного элемента для пар и сообщение о том что нельзя создать производный элемент для элемента без пары
* */