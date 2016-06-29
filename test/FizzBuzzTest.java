import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {

	FizzBuzz res = new FizzBuzz();
	
	@Test
	public void printNumers(){
		assertThat(res.printNumber(), containsString("1"));
		assertThat(res.printNumber(), containsString("47"));
		assertThat(res.printNumber(), containsString("97"));
	}
	
	@Test
	public void printNumersWithFizz(){
		assertThat(res.printNumber(), containsString("Fizz"));
	}
	
	@Test
	public void printNumersWithBuzz(){
		assertThat(res.printNumber(), containsString("Buzz"));
	}
	
	@Test
	public void printNumersWithFizzBuzz(){
		assertThat(res.printNumber(), containsString("FizzBuzz"));
	}
}
