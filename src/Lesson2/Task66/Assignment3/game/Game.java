package Lesson2.Task66.Assignment3.game;

import Lesson2.Task66.Assignment3.cards.Card;
import Lesson2.Task66.Assignment3.cards.Deck;
import Lesson2.Task66.Assignment3.players.Player;
import Lesson2.Task66.Assignment3.players.PlayerState;

import static Lesson2.Task66.Assignment3.game.GameState.*;

public class Game {
    private Deck currentDeck;
    private Player winner;
    private GameState currentGameState;

    private Game() {
        currentGameState = STOP;
    }

    private boolean isRunning() {
        return currentGameState == RUNNING;
    }

    private void start() {
        currentGameState = RUNNING;
        currentDeck = new Deck();
    }

    private GameState checkState(Player player1, Player player2) {
        int player1Points = player1.getPoints();
        int player2Points = player2.getPoints();
        if (player1.isActive() || player2.isActive()
                && (player1Points < 21 && player2Points < 21)) {
            return RUNNING;
        }
        if (player1Points == player2Points || player1Points > 21 && player2Points > 21) {
            return DRAW;
        }
        if (player1Points > player2Points && player1Points <= 21) {
            winner = player1;
        } else {
            winner = player2;
        }
        return WIN;
    }

    private Card getTopCard() {
        return currentDeck.getTopCard();
    }

    private void takeTurn(Player player) {
        if (player.isActive()) {
            Card card = getTopCard();
            System.out.println("Игрок " + player + " получил " + card);
            player.takeCard(card);
        } else {
            System.out.println("Игрок " + player + " пассует");
        }
    }

    void printResult() {
        System.out.println("\nРезультат игры: " + currentGameState);
        if (currentGameState == WIN) {
            System.out.println("Победитель: " + winner);
        }
    }

    public static void main(String[] args) {
        Player player1 = new Player("Alisa");
        Player player2 = new Player("Marusya");
        System.out.println("Батл между " + player1 + " и " + player2);
        Game game = new Game();
        game.start();
        int counter = 0;
        while (game.isRunning()) {
            counter++;
            System.out.println("\nХод " + counter);
            game.takeTurn(player1);
            game.takeTurn(player2);

            game.currentGameState = game.checkState(player1, player2);
        }
        game.printResult();
    }

}
