import static org.junit.Assert.*;

import org.junit.Test;

public class LeapYearTest {
	LeapYear leapyear = new LeapYear();
	
	@Test
	public void testDivisibleBy4() {
		assertFalse("false", leapyear.judgeLeapYear(2001));
		assertTrue("true", leapyear.judgeLeapYear(1996));
	}

	public void testAllRules() {
		assertFalse("false", leapyear.judgeLeapYear(1900));
		assertTrue("true", leapyear.judgeLeapYear(2000));
	}
}
