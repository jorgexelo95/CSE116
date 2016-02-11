package tests;
import org.junit.Test;

import code.TwoChars;

import static org.junit.Assert.assertTrue;


public class StringTests {
	private void commonTestCode(String a, char c, char d, int expected){
		TwoChars tc= new TwoChars();
		int actual=tc.count_two_chars(a,c,d);
		assertTrue("I expected the results of "+a+" "+c+" "+d+" to be"+expected+" but instead I got "+actual+".",expected==(actual));
	}

@Test public void test01(){commonTestCode("character",'a','c',4);}
@Test public void test02(){commonTestCode("afadadafa",'a','f',7);}
@Test public void test03(){commonTestCode("hey hows it going!", 'h','!',3);}
@Test public void test04(){commonTestCode("",'a','b',0);}
}