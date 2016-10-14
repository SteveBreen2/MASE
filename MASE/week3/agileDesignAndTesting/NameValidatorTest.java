package agileDesignAndTesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import static junitparams.JUnitParamsRunner.$;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class NameValidatorTest {

	@Parameters
	public static Object[] getParameters() throws Exception {
		return $($("qwe",true),//3
				$("qwer",true),//4
				$("abcdefghijklmnopqrs",true),//19
				$("abcdefghijklmnopqrst",true),//20
				$("ab",false),//2
				$("abcdefghijklmnopqrstu",false),//21
				$("1bcdefghijklmnopqrst",false),//20 with number at start
				$("abcdefghij1lmnopqrst",false),//20 with number in middle
				$("abcdefghijklmnopqrs1",false)//20 with number at end
				);
	}

	@Test
	@Parameters(method="getParameters")
	public void test(String s,boolean answer) {
		assertEquals(answer,NameValidator.isValid(s));
	}

}
