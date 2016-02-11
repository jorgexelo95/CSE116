package tests;
import org.junit.Test;

import code.PalinDrome;

import static org.junit.Assert.assertTrue;
public class PalindromeTests {
	private void commonTestCode(String s, boolean expected){
	PalinDrome pd=new PalinDrome();
	boolean actual = pd.palindrome(s);
	assertTrue("I expected the results of "+s+" to be "+expected+"but instead got"+actual+".", expected==actual);
}
@Test public void test01(){commonTestCode("Racecar", true);}
@Test public void test02(){commonTestCode("awesome", false);}
@Test public void test03(){commonTestCode("Mom", true);}
@Test public void test04(){commonTestCode("crazy",false);}
@Test public void test05(){commonTestCode("moom", true);}
}
