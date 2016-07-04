import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class MineFieldsTest {

	MineFields field = new MineFields();
	char[] res1 = {'*', '1', '0', '0', 
				   '1', '1', '0', '0', 
				   '0', '0', '0', '0'};
	char[] res2 = {'*', '2', '1', '1', 
			   	   '1', '2', '*', '1', 
			   	   '0', '1', '1', '1'};
	
	char[] res3 = {'*', '2', '1', '1', 
		   	       '2', '3', '*', '1', 
		   	       '1', '*', '2', '1'};
			
	
	private void setField(int col, int row) {
		field.setField(col, row);
	}
	private void setMine(int x, int y) {
		field.setMine(x, y);
	}
	
	@Test
	public void testOneMine() {
		setField(4, 3);
		setMine(0, 0);
		assertThat(field.getRes(), is(res1));
	}
	
	@Test
	public void testTwoMine() {
		setField(4, 3);
		setMine(0, 0);
		setMine(1, 2);
		assertThat(field.getRes(), is(res2));
	}
	
	@Test
	public void testMoreThanTwoMine() {
		setField(4, 3);
		setMine(0, 0);
		setMine(1, 2);
		setMine(2, 1);
		assertThat(field.getRes(), is(res3));
	}
}
