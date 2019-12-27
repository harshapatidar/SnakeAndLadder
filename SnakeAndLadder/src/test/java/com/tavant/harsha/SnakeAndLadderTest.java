package com.tavant.harsha;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SnakeAndLadderTest {

	@Test
	public void testRollDice() {
		PositionOfSnakeAndLadder positionOfSnakeAndLadder=new PositionOfSnakeAndLadder();
		int maximum=7;
		int minimum=0;
		int result=positionOfSnakeAndLadder.rollDice();
		assertTrue("Unexpected Value",result>minimum && result<maximum);
	}
	
	@Test
	public void testSnakePosition() {
		PositionOfSnakeAndLadder positionOfSnakeAndLadder= new PositionOfSnakeAndLadder();
		int result= positionOfSnakeAndLadder.SnakeladderPosition.get(66);
		int snakePosition=48;
	   assertEquals(snakePosition, result,"Snake Not Found");
	}
	
	@Test
	public void testLadderPosition() {
		PositionOfSnakeAndLadder positionOfSnakeAndLadder= new PositionOfSnakeAndLadder();
		int result= positionOfSnakeAndLadder.SnakeladderPosition.get(33);
		int ladderPosition=49;
	    assertEquals(ladderPosition, result,"Ladder Not Found");
	}
	
	
	
}
