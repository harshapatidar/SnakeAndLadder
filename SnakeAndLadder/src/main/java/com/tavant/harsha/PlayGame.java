package com.tavant.harsha;

public class PlayGame extends PositionOfSnakeAndLadder {

	private String playerName;
	 
	PositionOfSnakeAndLadder positionOfSnakeAndLadder=new PositionOfSnakeAndLadder();

	public PlayGame(String playerName) {

		this.playerName = playerName;
	}

	public void startGame() {

		int turn = 1;

		while (positionOfSnakeAndLadder.computerPosition <= 100 || positionOfSnakeAndLadder.playerPosition <= 100) {

			if (turn % 2 != 0) {
				System.out.println(this.playerName + "'s Chance");

				positionOfSnakeAndLadder.playerPosition = positionOfSnakeAndLadder.playGame(positionOfSnakeAndLadder.playerPosition);

				System.out.println("your new position is " + positionOfSnakeAndLadder.playerPosition);
				System.out.println("");

			} else {

				System.out.println("Computer's chance");

				positionOfSnakeAndLadder.computerPosition = positionOfSnakeAndLadder.playGame(positionOfSnakeAndLadder.computerPosition);

				System.out.println("Computer's new position is " + positionOfSnakeAndLadder.computerPosition);
				System.out.println("");
			}
			turn++;

			if (positionOfSnakeAndLadder.computerPosition == 100) {
				System.out.println("Computer Won !!");
				System.exit(0);
			} else if (positionOfSnakeAndLadder.playerPosition == 100) {
				System.out.println("You Won !!");
				System.exit(0);
			} else
				continue;
		}

		
	}
}
