
public class GameOfLife {
	private int row = 0;
	private int col = 0;
	private int ln = 0; //live neighbours
	private int dn = 0; //dead neighbours

	
	private boolean isEmpty(int row, int col, char[][] grid){
		if(row == 0 || col == 0 || grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0){
			return true;
		}
		else 
			return false;
	}
	
	private boolean isAllDead(char[][] grid){
		int flag = 0;
		for(char[] rowOfCells : grid){
			for(char cell: rowOfCells){
				if(cell != '.'){
					flag = 1;
					break;
				}
			}
			if(flag == 1)
				break;
		}
		if(flag == 0)
			return true;
		else
			return false;
	}
	
	private void getNeighboursState(int r, int c, char[][] grid ){	
		ln = 0;
		dn = 0;
		if(r-1 >= 0){
			if(c-1 >= 0){
				if(grid[r-1][c-1] == '.')
					dn++;
				else
					ln++;
			}
			if(grid[r-1][c] == '.')
					dn++;
				else
					ln++;
			if(c+1 < col){
				if(grid[r-1][c+1] == '.')
					dn++;
				else
					ln++;
			}	
		}
		if(c-1 >= 0){
			if(grid[r][c-1] == '.')
				dn++;
			else
				ln++;
		}
		if(c+1 < col){
			if(grid[r][c+1] == '.')
				dn++;
			else
				ln++;
		}
		if(r+1 < row){
			if(c-1 >= 0){
				if(grid[r+1][c-1] == '.')
					dn++;
				else
					ln++;
			}
			if(grid[r+1][c] == '.')
				dn++;
			else
				ln++;
			if(c+1 < col){
				if(grid[r+1][c+1] == '.')
					dn++;
				else
					ln++;
			}	
		}
	}
	
	public char[][] nextGen(int rowNum, int colNum, char[][] grid) throws Exception{	
		row = rowNum;
		col = colNum;
		
		if(isEmpty(row, col, grid)){
			throw new Exception("grid is empty");
		}
		if(isAllDead(grid)){
			return grid;
		}
		char res[][] = new char[row][col];
		for(int r = 0; r < row; r++){
			for(int c = 0; c < col; c++){
				getNeighboursState(r, c, grid);
				//cell is live
				if(grid[r][c] == '*'){
					if(ln == 0 || ln > 3)
						res[r][c] = '.';
					else
						res[r][c] = '*';
				}
				//cell is dead
				if(grid[r][c] == '.'){
					if(ln == 3)
						res[r][c] = '*';
					else
						res[r][c] = '.';
				}
			}
		}
		return res;
	}
}
