package snakeandladders;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.addSnake(new Snake(36,19));
	board.addSnake(new Snake(65,35));
	board.addSnake(new Snake(87,32));
	
        board.addLadder(new Ladder(7, 33));
	board.addLadder(new Ladder(37, 85));
	board.addLadder(new Ladder(51, 72));
	

        Dice dice = new Dice();
        Player player = new Player("Khushboo");
       
        Game game = new Game(board, dice, players);
        game.start();
    }
}