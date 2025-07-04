package com.snakesandladders;

import java.util.*;

public class Board {
    private final Map<Integer, Integer> positionOfSnakeAndLadder = new HashMap<>();

    public void addSnake(Snake snake) {
        positionOfSnakeAndLadder.put(snake.getHead(), snake.getTail());
    }

    public void addLadder(Ladder ladder) {
        positionOfSnakeAndLadder.put(ladder.getStart(), ladder.getEnd());
    }

    public int getNewPosition(int pos) {
        return positionOfSnakeAndLadder.getOrDefault(pos, pos);
    }
}
