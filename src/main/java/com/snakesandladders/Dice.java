package com.snakesandladders;

import java.util.Random;

/*
 * Represents a standard 6-faced dice.
 */

public class Dice {
    private static final int DICE_FACES = 6;
    private final Random random;

    public Dice() {
        this.random = new Random();
    }

    /*
     * Rolls the dice and returns a value between 1 and 6.
     */
    public int roll() {
        return random.nextInt(DICE_FACES) + 1;
    }

   }