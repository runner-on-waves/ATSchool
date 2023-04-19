package Lesson3.Assignment1;

import java.util.NoSuchElementException;

class NatureElement {
    NatureElement connect(NatureElement element) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    static NatureElement create(String elementName){
        switch (elementName) {
            case "Fire":
                return new Fire();
            case "Water":
                return new Water();
            case "Earth":
                return new Earth();
            case "Air":
                return new Air();
            case "Energy":
                return new Energy();//элемент был добавлен, так как может быть использован для создания других элементов в сочетании с базовыми
            default:
                throw new NoSuchElementException();
        }
    }
}

