package htmlGrammer.ValidationTests;

import htmlGrammer.Parser;
import static org.junit.jupiter.api.Assertions.*;
import java.io.StringReader;
import org.junit.jupiter.api.Test;

class Test7 {

	@Test
	// Wrong Test
	void test() {
		try {StringReader testString = new StringReader("ADD LINK WITH LINK \"www.boho.com\" WITH TEXT \"Click Here\" \n EXIT");
		Parser parser = new Parser(testString);
		parser.start();	
		}
		catch(Exception e){
			fail("Grammer is incorrect");
		}
	}

}
