package Lesson2.Task66.Assignment3.cards;

public enum CardSuit {
    DIAMONDS("Бубны"),
    HEARTS("Червы"),
    SPADES("Пики"),
    CLUBS("Трефы");
    private final String cardSuitName;

    CardSuit(String cardSuitName) {
        this.cardSuitName = cardSuitName;
    }

    public String getCardSuitName() {
        return cardSuitName;
    }
}
