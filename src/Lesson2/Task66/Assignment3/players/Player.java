package Lesson2.Task66.Assignment3.players;

import Lesson2.Task66.Assignment3.cards.Card;
import Lesson2.Task66.Assignment3.cards.CardHand;
import static Lesson2.Task66.Assignment3.players.PlayerState.*;


public class Player {
    private int nervousnessRate;
    private PlayerState state;
    private CardHand playerHand;
    private final String playerName;
    public PlayerState getState() {
        return state;
    }
    public Player(String name) {
        this.playerName = name;
        nervousnessRate = 0;
        state = ACTIVE;
        playerHand = new CardHand();
    }

    private void checkState() {
        int currentPoints = playerHand.getPoints();
        if (currentPoints == 19 || currentPoints == 20 || currentPoints == 21) {
            state = STOP;
        } else if (currentPoints > 10) {
            nervousnessRate += currentPoints - 10;
            int randomNervousnessRate = (int) (Math.random() * 10);
            if (randomNervousnessRate < nervousnessRate) {
                state = STOP;
            }
        }
        System.out.println("    Очки: " + currentPoints + ", статус игрока: " + state + ", уровень нервозности: " + nervousnessRate);

    }

    public boolean isActive(PlayerState state) {
        return state == ACTIVE;
    }

    public void takeCard(Card card) {
        playerHand.addCard(card);
        this.checkState();

    }

    public int getPoints() {
        return playerHand.getPoints();
    }

    public String toString() {
        return this.playerName;
    }
}
