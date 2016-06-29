import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.containsString;


public class PrimeCompositeTest {

	PrimeComposite res = new PrimeComposite();
	
	@Test
	public void numberIsPrime() throws Exception{
		assertThat(res.printNumber(2), is("prime"));
		assertThat(res.printNumber(13), is("prime"));
	}
	
	@Test
	public void numberIsComposite() throws Exception{
		//assertThat(res.printNumber(4), is("composite"));
		assertThat(res.printNumber(27), is("composite"));
	}
	
	@Test
	public void numberIsCompositeNotEven() throws Exception{
		assertThat(res.printNumber(9), is("composite"));
		assertThat(res.printNumber(25), is("composite"));
	}
	
	@Test
	public void printValueOfNumber() throws Exception{
		assertThat(res.printNumber(1), is("1"));
		assertThat(res.printNumber(4), is("4"));
		assertThat(res.printNumber(24), is("24"));
	}
	
	/*@Test
	public void printNumbers() throws Exception{
		assertThat(res.printRes(), containsString("prime 32 composite 34 composite 36 prime 38 composite 40"));
		assertThat(res.printRes(), containsString("1"));
	}*/
	
	@Rule
    public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void printNumbersInSpecifiedRanges() throws Exception{
		assertThat(res.printRes(1, 10), is("1 prime prime 4 prime 6 prime 8 composite 10"));
		
		exception.expect(Exception.class);
		exception.expectMessage(containsString("INVALID PARAMETER"));
		res.printRes(0, 12);
	}
	
	

}
