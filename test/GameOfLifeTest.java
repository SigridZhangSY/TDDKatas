import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GameOfLifeTest {
	
	GameOfLife game = new GameOfLife();
	
	private char[][] setCells (int rowNum, int colNum, int[][] livePos){
		char[][] grid = new char[rowNum][colNum];
		for(int i = 0; i < rowNum; i++)
			for(int j = 0; j < colNum; j++)
					grid[i][j] = '.';
		if(!(livePos == null || livePos.length == 0 || livePos[0] == null || livePos[0].length == 0)){
			for(int i = 0; i < livePos.length; i++)
				grid[livePos[i][0]][livePos[i][1]] = '*';
		}
		return grid;	
	}
	
	char[][] test1 = null;
	
	//char[][] test2 = {{'.','.','.'},{'.','.','.'},{'.','.','.'}};
	char[][] test2 = setCells(3, 3, null);
	
	//char[][] test3 = {{'.','.','.'},{'.','*','.'},{'.','.','.'}};
	int[][] livePos3 = {{1,1}};
	char[][] test3 = setCells(3, 3, livePos3);
	
	//char[][] test4 = {{'.','.','*'},{'.','*','*'},{'.','*','*'}};
	//char[][] res4 = {{'.','.','*'},{'.','.','.'},{'.','*','*'}};
	int[][] livePos4_t = {{0,2},{1,1},{1,2},{2,1},{2,2}};
	char[][] test4 = setCells(3, 3, livePos4_t);
	int[][] livePos4_r = {{0,2},{2,1},{2,2}};
	char[][] res4 = setCells(3, 3, livePos4_r);
	
	//char[][] test5 = {{'.','.','*'},{'.','*','*'},{'.','.','*'}};
	int[][] livePos5 = {{0,2},{1,1},{1,2},{2,2}};
	char[][] test5 = setCells(3, 3, livePos5);
	
	//char[][] test6 = {{'.','.','*'},{'.','*','*'},{'.','.','.'}};
	//char[][] res6 = {{'.','*','*'},{'.','*','*'},{'.','.','.'}};
	int[][] livePos6_t = {{0,2},{1,1},{1,2}};
	char[][] test6 = setCells(3, 3, livePos6_t);
	int[][] livePos6_r = {{0,1},{0,2},{1,1},{1,2}};
	char[][] res6 = setCells(3, 3, livePos6_r);
	
	/*char[][] test7 = {{'.','.','.','.','.','.','.','.'},
					  {'.','.','.','.','*','.','.','.'},
					  {'.','.','.','*','*','.','.','.'},
					  {'.','.','.','.','.','.','.','.'}};
	char[][] res7 = {{'.','.','.','.','.','.','.','.'},
			  		 {'.','.','.','*','*','.','.','.'},
			  		 {'.','.','.','*','*','.','.','.'},
			  		 {'.','.','.','.','.','.','.','.'}};*/
	int[][] livePos7_t = {{1,4},{2,3},{2,4}};
	char[][] test7 = setCells(4, 8, livePos7_t);
	int[][] livePos7_r = {{1,3},{1,4},{2,3},{2,4}};
	char[][] res7 = setCells(4, 8, livePos7_r);
	
	
	@Rule
    public ExpectedException exception = ExpectedException.none();
	@Test
	public void testEmptyGrid() throws Exception{
		exception.expect(Exception.class);
		exception.expectMessage(containsString("grid is empty"));
		game.nextGen(0, 0, test1);
	}
	
	@Test
	public void testAllDead() throws Exception{
		assertThat(test2,is(game.nextGen(3, 3, test2)));
	}
	
	@Test
	public void testOnlyOneLive() throws Exception{
		assertThat(test2,is(game.nextGen(3, 3, test3)));
	}
	
	//rule changes
	/*@Test
	public void testLiveWithMoreThan3LiveNeughbours() throws Exception{
		assertThat(res4, is(game.nextGen(3, 3, test4)));
	}
	
	@Test
	public void testLiveWith3LiveNeughbours() throws Exception{
		assertThat(test5, is(game.nextGen(3, 3, test5)));
	}*/
	
	@Test
	public void testDeadWith3LiveNeughbours() throws Exception{
		assertThat(res6, is(game.nextGen(3, 3, test6)));
	}
	
	@Test
	public void testGivenCase() throws Exception{
		assertThat(res7, is(game.nextGen(4, 8, test7)));
	}

}
