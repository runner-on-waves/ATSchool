package Lesson2.Task66.Assignment3.cards;

public class Card {
    private CardType currentType;
    private CardSuit currentCardSuit;

    public void setCurrentType(CardType currentType) {
        this.currentType = currentType;
    }

    public Card(CardType currentType, CardSuit currentCardSuit) {
        this.currentType = currentType;
        this.currentCardSuit = currentCardSuit;
    }

    public void setCurrentCardSuit(CardSuit cardSuit) {
        this.currentCardSuit = cardSuit;
    }

    public int getPoints() {
        return this.currentType.getPoints();
    }

    public String toString() {
        return currentType.getName() + " " + currentCardSuit.getCardSuitName();
    }
}
