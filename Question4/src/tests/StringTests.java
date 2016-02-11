package tests;

import code.TwoStrings;
import org.junit.Test; 
import static org.junit.Assert.assertTrue;

public class StringTests {
	private void commonTestCode(String s, String characters, int expected){
		TwoStrings ts=new TwoStrings();
		int actual = ts.count_chars_in_String(s, characters);
		assertTrue("I expect the results of"+format(s)+", "+format(characters)+"to be"+expected+" but instead got "+actual+".",expected==(actual));
		}

	private String format(String s) {
		if (s==null){return "null";}
		else{return "\"" +s+ "\"";}
	}

@Test public void test01(){commonTestCode("mooo","mom",5);}
@Test public void test02(){commonTestCode("elephant","ear",3);}
@Test public void test03(){commonTestCode("car","esg",0);}
@Test public void test04(){commonTestCode("","",0);}
}

		
		
		
		
