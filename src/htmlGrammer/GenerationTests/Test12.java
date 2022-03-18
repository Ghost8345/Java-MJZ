package htmlGrammer.GenerationTests;

import static org.junit.jupiter.api.Assertions.*;
import java.io.StringReader;
import org.junit.jupiter.api.Test;
import htmlGrammer.Parser;

class Test12 {

	@Test
	void test() throws Exception {
		StringReader testString = new StringReader("ADD IMAGE WITH SOURCE \"c/users/kali/ray.jpg\" \n EXIT");
		Parser parser = new Parser(testString);
		assertEquals("<img src=\"c/users/kali/ray.jpg\"></img>", parser.start());
	}

}
