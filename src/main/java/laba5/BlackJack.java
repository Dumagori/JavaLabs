package laba5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class BlackJack {
    public void Play() {
        System.out.println("Welcome to Blackjack!");
        Deck playingDeck = new Deck();
        playingDeck.fillDeck();
        playingDeck.shuffle();
        Deck playerCards = new Deck();
        double playerMoney = 1000.0D;
        Deck dealerCards = new Deck();
        Scanner userInput = new Scanner(System.in);

        while(playerMoney > 0.0D) {
            System.out.println("You have $" + playerMoney + ", how much would you like to bet?");
            double playerBet = userInput.nextDouble();
            boolean endRound = false;
            if (playerBet > playerMoney) {
                System.out.println("You cannot bet more than you have.");
                break;
            }

            System.out.println("Dealing...");
            playerCards.draw(playingDeck);
            playerCards.draw(playingDeck);
            dealerCards.draw(playingDeck);
            dealerCards.draw(playingDeck);

            int response;
            do {
                System.out.println("Your Hand:" + playerCards.toString());
                System.out.println("Your hand is currently valued at: " + playerCards.getHandValue());
                System.out.println("Dealer Hand: " + dealerCards.getCard(0).toString() + " and [hidden]");
                System.out.println("Would you like to (1)Hit or (2)Stand");
                response = userInput.nextInt();
                if (response == 1) {
                    playerCards.draw(playingDeck);
                    System.out.println("You draw a:" + playerCards.getCard(playerCards.getDeckSize() - 1).toString());
                    if (playerCards.getHandValue() > 21) {
                        System.out.println("Bust. Currently valued at: " + playerCards.getHandValue());
                        playerMoney -= playerBet;
                        endRound = true;
                        break;
                    }
                }
            } while(response != 2);

            System.out.println("Dealer Cards:" + dealerCards.toString());
            if (dealerCards.getHandValue() > playerCards.getHandValue() && !endRound) {
                System.out.println("Dealer beats you " + dealerCards.getHandValue() + " to " + playerCards.getHandValue());
                playerMoney -= playerBet;
                endRound = true;
            }

            while(dealerCards.getHandValue() < 17 && !endRound) {
                dealerCards.draw(playingDeck);
                System.out.println("Dealer draws: " + dealerCards.getCard(dealerCards.getDeckSize() - 1).toString());
            }

            System.out.println("Dealers hand value: " + dealerCards.getHandValue());
            if (dealerCards.getHandValue() > 21 && !endRound) {
                System.out.println("Dealer Busts. You win!");
                playerMoney += playerBet;
                endRound = true;
            }

            if (dealerCards.getHandValue() == playerCards.getHandValue() && !endRound) {
                System.out.println("Push.");
                endRound = true;
            }

            if (playerCards.getHandValue() > dealerCards.getHandValue() && !endRound) {
                System.out.println("You win the hand.");
                playerMoney += playerBet;
                endRound = true;
            } else if (!endRound) {
                System.out.println("Dealer wins.");
                playerMoney -= playerBet;
            }

            playerCards.resetDeck(playingDeck);
            dealerCards.resetDeck(playingDeck);
            System.out.println("End of Hand.");
        }

        System.out.println("Game over! You lost all your money. :(");
        userInput.close();
    }
}
