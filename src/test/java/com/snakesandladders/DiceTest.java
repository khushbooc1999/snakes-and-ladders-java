package com.snakesandladders;


import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*;


public class DiceTest {
    @Test
    void diceRollInRange() {
        Dice dice = new Dice(6);
        int roll = dice.roll();
        assertTrue(roll >= 1 && roll <= 6);
    }
}