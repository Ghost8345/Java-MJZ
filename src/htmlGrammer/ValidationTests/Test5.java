package htmlGrammer.ValidationTests;

import htmlGrammer.Parser;
import static org.junit.jupiter.api.Assertions.*;
import java.io.StringReader;
import org.junit.jupiter.api.Test;

class Test5 {

	@Test
	// Wrong Test
	void test() {
		try {StringReader testString = new StringReader("ADD LINK AND WITH TEXT \"Click Here\" AND WITH LINK \"www.boho.com\" \n EXIT");
		Parser parser = new Parser(testString);
		parser.start();	
		}
		catch(Exception e){
			fail("Grammer is incorrect");
		}
	}

}
