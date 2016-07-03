import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class LCDDigitsTest {

	LCDDigits LCD = new LCDDigits();
	String stringOf0 = "._.\n|.|\n|_|";
	String stringOf910 ="._. ... ._.\n|_| ..| |.|\n..| ..| |_|";
	
	@Test
	public void testNumberSmallerThan10() {
		assertThat(LCD.printNumber(0), is(stringOf0));
	}
	
	@Test
	public void testAnyNumber() {
		assertThat(LCD.printNumber(910), is(stringOf910));
	}

}
