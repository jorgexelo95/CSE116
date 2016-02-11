package tests;
import org.junit.Test;

import code.ReplacingCharacters;

import static org.junit.Assert.assertTrue;
public class ReplaceCharacterTests {
	private void commonTestCode(String input, String targets, char c, String expected){
		ReplacingCharacters rc = new ReplacingCharacters();
		String actual = rc.replaceCharacters(input,targets,c);
		assertTrue("I expected "+input+" "+targets+" "+c+" to be"+expected+" instead I got "+actual+".", expected.equals(actual));
	}
@Test public void test0(){commonTestCode("banana","bn",'?',"?a?a?a");}
}
