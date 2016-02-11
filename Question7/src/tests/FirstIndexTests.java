package tests;
import org.junit.Test;

import code.AdjacentRepeats;

import static org.junit.Assert.assertTrue;

public class FirstIndexTests {
	private void commonTestCode(String input, int expected){
		AdjacentRepeats ar= new AdjacentRepeats();
		int actual=ar.hasAdjacentRepeats(input);
		assertTrue("I expected "+input+" to be "+expected+" however i got "+actual+".",expected==actual);
	}
@Test public void test01(){commonTestCode("book",1);}
@Test public void test02(){commonTestCode("oboe",-1);}
@Test public void test03(){commonTestCode("barkkla", 3);}

}
