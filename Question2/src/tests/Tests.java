package tests;
import org.junit.Test;

import code.CharString;

import static org.junit.Assert.assertTrue;

public class Tests {
	private void commonTestCode(String a, char b, int expected){
		CharString cs=new CharString();
		int actual=cs.count_one_char(a, b);
		assertTrue("I expected the results of "+a+" "+b+"to be "+expected+"but instead I got "+actual+".", expected==(actual));
	}
@Test public void test01(){commonTestCode("character",'a',2);}
@Test public void test02(){commonTestCode("",'a',0);}
@Test public void test03(){commonTestCode("asada",'!',0);}
@Test public void test04(){commonTestCode("a!a!a!",'!',3);}
}

