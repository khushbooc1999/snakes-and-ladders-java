	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	package com.snakesandladders;

	import java.util.Scanner;

	public class Game {
		private final List<Player> players;
		private final Board board;
		private final Dice dice;

		public Game(ArrayList<Player> players, Board board, Dice dice) {
			this.players = players;
			this.board = board;
			this.dice = dice;
		}

		public void start() {
			Scanner scanner = new Scanner(System.in);
		int turn =0;
			
		

			while (turn == 0) {
			for(int i=0 ; i< players.size();i++){
				System.out.print("Please enter the value on dice...");
				int roll = scanner.nextInt();
				if(roll<1 || roll>6){
			continue;
			}
		

				//int roll = dice.roll();
				System.out.println("You rolled a " + roll);

				int tentativePos = players.get(i).getPosition() + roll;

				if (tentativePos > 100) {
					System.out.println("You need exact roll to reach 100. Stay at " + players.get(i).getPosition());
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

				players.get(i).moveTo(finalPos);
				System.out.println("Current Position: " + players.get(i).getPosition());
			if(players.get(i).hasWon()) {
				turn = 1;
			}
		break;
			
			
			}

			System.out.println("Congratulations! You won!");
		
	}
		}
	}