package Lesson2.Task66.Assignment3.cards;

public class CardHand {
    private Card[] cards;

    public CardHand() {
        cards = new Card[0];
    }

    public void addCard(Card card) {
        Card[] arrayCopy = cards;
        cards = new Card[arrayCopy.length + 1]; // резервируем место
        System.arraycopy(arrayCopy, 0, cards, 0, arrayCopy.length);
        cards[cards.length - 1] = card;
    }

    public int getPoints() {
        int sum = 0;
        for (Card card : cards) {
            sum = sum + card.getPoints();
        }
        return sum;
    }
}
