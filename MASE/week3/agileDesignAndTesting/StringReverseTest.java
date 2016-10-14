package agileDesignAndTesting;

import static org.junit.Assert.*;

import junitparams.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;

@RunWith(JUnitParamsRunner.class)
public class StringReverseTest {

	
@Parameters
public static final Object[] getStrings(){
	return $(
			$("12345","54321"),
			$("",""),
			$("QWE","EWQ"),
			$("QwEr","rEwQ"),
			$("QwEr QwEr","rEwQ rEwQ"),
			$("!£$%", "%$£!"),
			$("racecar","racecar"),
			$("racecar1","1racecar")
			);
}
	
	@Test
	@Parameters(method="getStrings")
	public void stringReversalTest(String before,String after) {
		
		assertEquals(StringReverse.reverse(before),after);
		
	}
	
	
}