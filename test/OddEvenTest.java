import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class OddEvenTest {

	
	
	@Test
	public void numberIsEven(){
		OddEven res = new OddEven();
		assertThat(res.printNumber(4), is("Even"));
		assertThat(res.printNumber(12), is("Even"));
	}
	
	@Test
	public void numberIsOdd(){
		OddEven res = new OddEven();
		assertThat(res.printNumber(1), is("Odd"));
		assertThat(res.printNumber(15), is("Odd"));
	}

	@Test
	public void numberIsPime(){
		OddEven res = new OddEven();
		assertThat(res.printNumber(2), is("2"));
		assertThat(res.printNumber(5), is("5"));
	}
	
	@Test
	public void printRes(){
		OddEven res = new OddEven();
		assertThat(res.printRes(1, 10), is("Odd 2 3 Even 5 Even 7 Even Odd Even"));
		assertThat(res.printRes(0, 10), is("INVALID PARAMETER!"));
	}

}
