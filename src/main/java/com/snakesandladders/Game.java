package com.snakesandladders;

import java.util.Scanner;

public class Game {
    private final Player player;
    private final Board board;
    private final Dice dice;

    public Game(Player player, Board board, Dice dice) {
        this.player = player;
        this.board = board;
        this.dice = dice;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        
        while (!player.hasWon()) {
            System.out.print("Press Enter to roll the dice...");
            scanner.nextLine();

            int roll = dice.roll();
            System.out.println("You rolled a " + roll);

            int tentativePos = player.getPosition() + roll;

            if (tentativePos > 100) {
                System.out.println("You need exact roll to reach 100. Stay at " + player.getPosition());
                continue;
            }

            int finalPos = board.getNewPosition(tentativePos);
            if (finalPos < tentativePos) {
                System.out.println("Bitten by a snake. Go down to " + finalPos);
            } else if (finalPos > tentativePos) {
                System.out.println(" Climbed a ladder to " + finalPos);
            } else {
                System.out.println(" Moved to " + finalPos);
            }

            player.moveTo(finalPos);
            System.out.println("Current Position: " + player.getPosition());
        }

        System.out.println("Congratulations! You won!");
    }
}