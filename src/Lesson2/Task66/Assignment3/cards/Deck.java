package Lesson2.Task66.Assignment3.cards;

import java.util.Random;

public class Deck {
    private Card[] cards;

    public Deck() {

        int numOfDecks = randomNumber(1, 8);
        cards = new Card[52 * numOfDecks];
        int index = 0;
        for (int i = 1; i <= numOfDecks; i++) {
            for (CardType cardType : CardType.values()) {
                for (CardSuit suit : CardSuit.values()) {
                    cards[index] = new Card(cardType, suit);
                    index++;
                }
            }
        }
    }

    private void shuffle() {
        //Алгоритм перемешивания массива
        Random rand = new Random();
        for (int i = 0; i < cards.length; i++) {
            int randomIndexToSwap = rand.nextInt(cards.length);// получаем случайный индекс из списка элементов
            Card temp = cards[randomIndexToSwap];// сохраняем в буфер элемент со случайным индексом
            //меняем элементы местами
            cards[randomIndexToSwap] = cards[i];
            cards[i] = temp;
        }
    }

    public Card getTopCard() {
        shuffle();
        return cards[0];
    }

    static int randomNumber(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}

