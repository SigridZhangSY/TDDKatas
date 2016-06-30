import static org.junit.Assert.*;

import org.junit.Test;

public class BowlingGameTest {
	private BowlingGame game = new BowlingGame();
	
	private void rollMany(int pins, int times){
		for(int i = 0; i < times; i++)
			game.roll(pins);
	}
	
	@Test
	public void testGutterGame(){
		rollMany(0, 20);
		assertEquals(game.score(), 0);
	}
	
	@Test
	public void testAllOnes(){
		rollMany(1, 20);
		assertEquals(game.score(), 20);
	}
	
	@Test
	public void testOneSpare(){
		game.roll(4);
		game.roll(6);//spare
		rollMany(1, 2);
		rollMany(0, 16);
		assertEquals(game.score(), 13);
	}
	
	@Test
	public void testOneStrike(){
		game.roll(10);//strike
		game.roll(3);
		game.roll(4);
		rollMany(0, 17);
		assertEquals(game.score(), 24);
	}
	
	@Test
	public void testPerfectGame(){
		/*rollMany(0, 18);
		game.roll(10);
		game.roll(3);
		game.roll(7);*/
		rollMany(10, 12);
		assertEquals(game.score(), 300);
	}
	
	@Test
	public void testSpareInLastFrame(){
		rollMany(0, 18);
		game.roll(4);
		game.roll(6);
		game.roll(1);
		assertEquals(game.score(), 11);
	}
	
	@Test
	public void testStrikeInLastFrame(){
		rollMany(0, 18);
		game.roll(10);
		game.roll(1);
		game.roll(2);
		assertEquals(game.score(), 13);
	}
	

}
