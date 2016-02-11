package tests;
import org.junit.Test;

import code.ReplacingVowels;

import static org.junit.Assert.assertTrue;
public class ReplaceVowelTests {
	private void commonTestCode(String input, String expected){
		ReplacingVowels rv = new ReplacingVowels();
		String actual=rv.replaceVowels(input);
		assertTrue("I expected "+input+" to be "+expected+" but instead i got "+actual+".",expected.equals(actual));
		
}
@Test public void test01(){commonTestCode("book","b**k");}	
	}
