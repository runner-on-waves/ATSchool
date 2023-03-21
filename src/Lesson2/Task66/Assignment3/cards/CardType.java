package Lesson2.Task66.Assignment3.cards;

public enum CardType {
    TWO("Двойка", 2),
    THREE("Тройка", 3),
    FOUR("Четверка", 4),
    FIVE("Пятерка", 5),
    SIX("шестерка", 6),
    SEVEN("Семерка", 7),
    EIGHT("Восьмерка", 8),
    NINE("Девятка", 9),
    TEN("Десятка", 10),
    JACK("Валет", 10),
    QUEEN("Королева", 10),
    KING("Король", 10),
    ACE("Туз", 11);

    private final String name;
    private int point;

    CardType(String name, int point) {
        this.name = name;
        this.point = point;

    }
    public String getName() {
        return name;
    }

    int getPoints() {
        return point;
    }

}
