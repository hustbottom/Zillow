import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;


public class Stringconversion_test extends TestCase {
@Test
void test(){
//	Stringconversion test = new Stringconversion();
	Assert.assertEquals(123, Stringconversion.stringTolong("123"));
	Assert.assertEquals(1234, Stringconversion.stringTolong("1234"));
	Assert.assertEquals(123, Stringconversion.stringTolong("+123"));
	Assert.assertEquals(-123, Stringconversion.stringTolong("-123"));
	
	
}
}
