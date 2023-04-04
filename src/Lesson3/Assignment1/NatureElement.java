package Lesson3.Assignment1;

class NatureElement {
    //protected String name;
    NatureElement connect(NatureElement element) {
        return new NatureElement();
    }

    static NatureElement create(String elementName) {
        switch (elementName) {
            case "Fire":
                return new Fire();
            case "Water":
                return new Water();
            case "Earth":
                return new Earth();
            case "Air":
                return new Air();
            default:
                System.out.println("Неизвестный элемент");
                return null;
        }

    }
}

