package Lesson4.Assignment1;

public class Square implements Function {
    @Override
    public int evaluate(int number) {//у класса Square метод evaluate возвращет параметр, умноженный на сам себя
        return number * number;
    }
}
