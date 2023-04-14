package Lesson4.Assignment1;

public class Double implements Function {
    @Override
    public int evaluate(int number) {//у класса Double метод evaluate умножает полученный параметр на 2
        return number * 2;
    }
}
