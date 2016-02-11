package tests;
import org.junit.Test;

import code.Repeats;

import static org.junit.Assert.assertTrue;

public class RepeatsTests {
	private void commonTestCode(String s, boolean expected){
		Repeats rp=new Repeats();
		boolean actual=rp.results(s);
		assertTrue("I expected "+s+" to be "+expected+" instead i got "+actual+".",expected==actual);
		
	}
@Test public void test01(){commonTestCode("book", true);}
@Test public void test02(){commonTestCode("oboe", false);}
}
