import org.omg.CORBA.IDLTypeOperations;

public class MineFields {
	char[] field;
	int M;
	int N;
	
	public void setField(int col, int row) {
		M = col;
		N = row;
		field = new char[M*N];
		for(int i = 0; i < field.length; i++){
			field[i] = '.';
		}
	}
	
	public void setMine(int x, int y){
		field[x*M+y] = '*';
	}
	
	private void updateFields(int i){
		if(i%M != 0){
			if(i-M-1 >= 0 && field[i-M-1] != '*')
				field[i-M-1] = (char)(field[i-M-1] + 1);
			if(i-1 >= 0 && field[i-1] != '*')
				field[i-1] = (char)(field[i-1] + 1);
			if(i+M-1 < field.length && field[i+M-1] != '*')
				field[i+M-1] = (char)(field[i+M-1] + 1);
		}
		if((i+1)%M != 0){
			if(i-M+1 >= 0 && field[i-M+1] != '*')
				field[i-M+1] = (char)(field[i-M+1] + 1);
			if(i+1 < field.length && field[i+1] != '*')
				field[i+1] = (char)(field[i+1] + 1);
			if(i+M < field.length && field[i+M] != '*')
				field[i+ M] = (char)(field[i+M] + 1);
		}

		if(i-M >= 0 && field[i-M] != '*')
			field[i-M] = (char)(field[i-M] + 1);
		if(i+M+1 < field.length && field[i+M+1] != '*')
			field[i+M+1] = (char)(field[i+M+1] + 1);
	}
	
	public char[] getRes(){
		//char[] res = new char[M*N];
		for(int i = 0; i < field.length; i++){
			if(field[i] != '*')
				field[i] = '0';
		}
		for(int i = 0; i < field.length; i++){
			if(field[i] == '*'){
				updateFields(i);
				//break;
			}
		}
		return field;
	}
}
