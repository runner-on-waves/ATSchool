package Lesson2.Task39;

public class Cat extends Animal {
    int age;
    String eyeColor;
    double weight;
    String woolColor;

    //1.Конструктор без параметров
    Cat() {
    }

    //2.Конструктор с параметром типа int
    Cat(int age) {
        this.age = age;
    }

    //3.Конструктор с параметром типа double
    Cat(double weight) {
        this.weight = weight;
    }

    //Для конструктора с одинаковым типом параметра нельзя гарантировать, что занесен нужный параметр.
    //В данном случае если передан только один параметр строка,значение всегда трактуется как eyeColor. Создать аналогичный
    //для woolcolor нельзя
    //4. Конструктор с параметром типа String
    Cat(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    //5. Конструктор с двумя параметрами типа String
    Cat(String eyeColor, String woolColor) {
        this.eyeColor = eyeColor;
        this.woolColor = woolColor;
    }

    //6. Конструктор с двумя параметрами тип String, тип int
    Cat(String eyeColor, int age) {
        this.eyeColor = eyeColor;
        this.age = age;
    }

    //7. Конструктор с двумя параметрами тип int, тип String,
    Cat(int age, String eyeColor) {
        this.eyeColor = eyeColor;
        this.age = age;
    }

    //8. Конструктор с двумя параметрами тип String, тип double
    Cat(String eyeColor, double weight) {
        this.eyeColor = eyeColor;
        this.weight = weight;
    }

    //9. Конструктор с двумя параметрами  тип double, тип String
    Cat(double weight, String eyeColor) {
        this.eyeColor = eyeColor;
        this.weight = weight;
    }

    //10. Конструктор с двумя параметрами  тип double, тип int
    Cat(double weight, int age) {
        this.age = age;
        this.weight = weight;
    }

    //11. Конструктор с двумя параметрами тип int, тип double
    Cat(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    //12. Конструктор с тремя параметрами типы String, String, int
    Cat(String eyeColor, String woolColor, int age) {
        this(eyeColor, woolColor);
        this.age = age;
    }

    //13.Конструктор с тремя параметрами типы String, String, double
    Cat(String eyeColor, String woolColor, double weight) {
        this(eyeColor, woolColor);
        this.woolColor = woolColor;
        this.weight = weight;
    }

    //14.Конструктор с тремя параметрами типы String, int, double
    Cat(String eyeColor, int age, double weight) {
        this.eyeColor = eyeColor;
        this.age = age;
        this.weight = weight;
    }

    //15.Конструктор с тремя параметрами типы String, double, int
    Cat(String eyeColor, double weight, int age) {
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.age = age;
    }

    //16.Конструктор с 4 параметрами типы int, String, double, String
    Cat(int age, String eyeColor, double weight, String woolColor) {
        this.age = age;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.woolColor = woolColor;
    }

    //17.Конструктор с 4 параметрами типы  String,int, double, String
    Cat(String eyeColor, int age, double weight, String woolColor) {
        this(age, eyeColor, weight, woolColor);
    }

    //18.Конструктор с 4 параметрами типы int, double,  String, String
    Cat(int age, double weight, String eyeColor, String woolColor) {
        this(age, eyeColor, weight, woolColor);
    }

    //19.Конструктор с 4 параметрами типы String, String, int, double,
    Cat(String eyeColor, String woolColor, int age, double weight) {
        this(age, eyeColor, weight, woolColor);
    }

    //20. Конструктор с 4 параметрами типы String, int,String, double
    Cat(String eyeColor, int age, String woolColor, double weight) {
        this(age, eyeColor, weight, woolColor);
    }

    //21. Конструктор с 4 параметрами типы String, double, int, String
    Cat(String eyeColor, double weight, int age, String woolColor) {
        this(age, eyeColor, weight, woolColor);
    }

    //22. Конструктор с 4 параметрами типы String, double, String, int
    Cat(String eyeColor, double weight, String woolColor, int age) {
        this(age, eyeColor, weight, woolColor);
    }

    //23. Конструктор с 4 параметрами типы double, String, String, int
    Cat(double weight, String eyeColor, String woolColor, int age) {
        this(age, eyeColor, weight, woolColor);
    }

    //24. Конструктор с 4 параметрами типы double,int, String, String,
    Cat(double weight, int age, String eyeColor, String woolColor) {
        this(age, eyeColor, weight, woolColor);
    }

    public String toString() {
        if (age == 1) {
            return String.format("Возраст кота  - %s год, цвет глаз - %s, вес - %s кг, цвет шерсти - %s",
                    age, eyeColor, weight, woolColor);
        } else if (age > 1 && age < 5) {
            return String.format("Возраст кота  - %s года, цвет глаз - %s, вес - %s кг, цвет шерсти - %s",
                    age, eyeColor, weight, woolColor);
        } else {
            return String.format("Возраст кота  - %s лет, цвет глаз - %s, вес - %s кг, цвет шерсти - %s",
                    age, eyeColor, weight, woolColor);
        }
    }


}
