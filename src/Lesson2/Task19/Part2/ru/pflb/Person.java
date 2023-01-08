package Lesson2.Task19.Part2.ru.pflb;

public abstract class Person {
    public int age;
    public String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("<Водитель %s> - возраст: <%s лет.>", name, age);
    }
}
