package tests;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import code.InputsReturns;


public class InputTests {
	private void commonTestCode(String input, String expected){
		InputsReturns ir = new InputsReturns();
		String actual = ir.results(input);
		assertTrue("I expect the results of"+format(input)+"to be"+format(expected)+" but instead got "+format(actual)+".", expected.equals(actual));
		
	}

	private String format(String input) {
		if (input==null){return "null";}
		else {return "\"" + input + "\"";}
		// TODO Auto-generated method stub
	}
	@Test public void test01() {commonTestCode("elephant","2");}
	@Test public void test02() {commonTestCode("1234","0");}
	@Test public void test03() {commonTestCode(null,"0"); }
	@Test public void test04() {commonTestCode("eeeee","5"); }
}
