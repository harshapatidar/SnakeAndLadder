package com.tavant.harsha;

import java.util.*;

public class PositionOfSnakeAndLadder extends SnakeAndLadderBoard {

	HashMap<Integer, Integer> SnakeladderPosition = new HashMap<Integer, Integer>();

	{
		// LadderPositions
		SnakeladderPosition.put(62, 81);
		SnakeladderPosition.put(74, 92);
		SnakeladderPosition.put(50, 69);
		SnakeladderPosition.put(42, 63);
		SnakeladderPosition.put(33, 49);
		SnakeladderPosition.put(13, 46);
		SnakeladderPosition.put(17, 25);

		// SnakePositions
		SnakeladderPosition.put(99, 41);
		SnakeladderPosition.put(89, 53);
		SnakeladderPosition.put(76, 58);
		SnakeladderPosition.put(66, 48);
		SnakeladderPosition.put(54, 31);
		SnakeladderPosition.put(43, 18);
		SnakeladderPosition.put(40, 3);
			
	}

	public int rollDice() {
		return ((int) (Math.random() * 6) + 1);
	}

	public int playGame(int position) {

		int diceThrow = 0;
		diceThrow = rollDice();
		System.out.println("Throw : " + diceThrow);

		if (position + diceThrow > 100)
			return position;

		else {

			position = position + diceThrow;

			if (SnakeladderPosition.containsKey(position)) {

				if (position > SnakeladderPosition.get(position))
					System.out.println("Bitten by snake go down");
				else
					System.out.println("Got a ladder climb up");

				return SnakeladderPosition.get(position);
			} else
				return position;
		}
	}

}
