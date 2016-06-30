import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class CalcStatTest {
	
	CalcStat res = new CalcStat();
	
	@Test
	public void oneNumber(){
		assertThat(res.printRes(new int[] {1}), is("1 1 1 1.0"));
		assertThat(res.printRes(new int[] {-1}), is("-1 -1 1 -1.0"));		
	}
	
	@Test
	public void twoNumber(){
		assertThat(res.printRes(new int[] {-1, 1}), is("1 -1 2 0.0"));
		assertThat(res.printRes(new int[] {27, 2}), is("27 2 2 14.5"));		
	}
	
	@Test
	public void moreThanTwoNumber(){
		assertThat(res.printRes(new int[] {-2, 17, 0, 101, 34}), is("101 -2 5 30.0"));
		
	}
}
