import static org.junit.Assert.*;
//
//import org.hamcrest.core.Is;
//import org.hamcrest.CoreMatchers;
//import static org.hamcrest.MatcherAssert.*;
//import org.junit.Test;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringSumTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testStringEmpty(){
		StringSum stringSum = new StringSum();
		assertEquals(stringSum.convertNum(""), 0);
		assertEquals(stringSum.convertNum(null), 0);	
	}
	
	@Test
	public void testStringNonnumberCharacter(){
		StringSum stringSum = new StringSum();
		assertEquals(stringSum.convertNum("@#$"), 0);
		assertEquals(stringSum.convertNum("23$"), 0);
		assertEquals(stringSum.convertNum("12#45"), 0);
	}
	
	@Test
	public void testStringNoNonnumberCharacter(){
		StringSum stringSum = new StringSum();
		assertEquals(stringSum.convertNum("1"), 1);
		assertEquals(stringSum.convertNum("12"), 12);
	}
	
	@Test
	public void testNumberWithPositiveSign(){
		StringSum stringSum = new StringSum();
		assertEquals(stringSum.convertNum("+1"), 1);
		assertEquals(stringSum.convertNum("+12"), 12);
	}
	
	@Test
	public void testSum(){
		StringSum stringSum = new StringSum();
		assertThat(stringSum.sum("", ""), is("0"));
		assertThat(stringSum.sum("", null), is("0"));
		assertThat(stringSum.sum("1", ""), is("1"));
		assertThat(stringSum.sum("1", "&"), is("1"));
		assertThat(stringSum.sum("1", "-2"), is("1"));
		assertThat(stringSum.sum("1", "+2"), is("3"));
		assertThat(stringSum.sum("1", "2"), is("3"));
		assertThat(stringSum.sum("1", "20"), is("21"));
		assertThat(stringSum.sum("11", "99"), is("110"));
	}


}
