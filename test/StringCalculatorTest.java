import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.containsString;

public class StringCalculatorTest {

	StringCalculator res = new StringCalculator();
	
	@Test
	public void strIsEmpty() throws Exception{
		assertEquals(res.getRes(""), 0);
		assertEquals(res.getRes(null), 0);
	}
	
	@Test
	public void strContainsOneNumber() throws Exception{
		assertEquals(res.getRes("1"), 1);
		assertEquals(res.getRes("0"), 0);
	}
	
	@Test
	public void strContainsTwoNumbers() throws Exception{
		assertEquals(res.getRes("0,1"), 1);
		assertEquals(res.getRes("1,2"), 3);
	}
	
	@Test
	public void strContainsSomeNumbers() throws Exception{
		assertEquals(res.getRes("0,1,2"), 3);
		assertEquals(res.getRes("10,20,30"), 60);
	}
	
	@Test
	public void strSplitByNewLine() throws Exception{
		assertEquals(res.getRes("1\n2"), 3);
		assertEquals(res.getRes("1\n2\n3"), 6);
	}
	
	@Test
	public void strSplitByNewLineAndComma() throws Exception{
		assertEquals(res.getRes("1\n2,3"), 6);
		assertEquals(res.getRes("1,2\n3"), 6);
	}

	@Test
	public void strWithSpecifiedDelimiters() throws Exception{
		assertEquals(res.getRes(";\n1;2"), 3);
	}
	
	@Rule
    public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void strWithNegatives() throws Exception{
		exception.expect(Exception.class);
		exception.expectMessage(containsString("negatives not allowed - -2"));
		res.getRes("1,-2,3");
		
		exception.expectMessage(containsString("negatives not allowed - -1,-3"));
		res.getRes("-1,2,-3");
	}
	
	@Test
	public void strWithNumBiggerThan1000() throws Exception{
		assertEquals(res.getRes("1001,1"), 1);
		assertEquals(res.getRes("1000,1"), 1001);
		assertEquals(res.getRes("1001,1,2"), 3);
	}
	
	@Test
	public void strWithSpecifiedDelimitersOfAnyLength() throws Exception{
		assertEquals(res.getRes("[***]\n1***2"), 3);
		assertEquals(res.getRes("[***]\n1***2***3"), 6);
	}
	
	@Test
	public void strWithMultipleDelimiters() throws Exception{
		assertEquals(res.getRes("[*][%]\n1*2"), 3);
		assertEquals(res.getRes("[*][%]\n1*2%3"), 6);
	}
	
	@Test
	public void strWithMultipleDelimitersOfAnyLength() throws Exception{
		assertEquals(res.getRes("[**][%%%]\n1**2"), 3);
		assertEquals(res.getRes("[**][%%%]\n1**2%%%3"), 6);
	}
}
