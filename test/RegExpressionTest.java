import static org.junit.Assert.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class RegExpressionTest {

	RegExpression res = new RegExpression();
	
	@Test
	public void testString(){
		assertThat(res.printRes("[abc]123"), is("abc"));
	}

}
