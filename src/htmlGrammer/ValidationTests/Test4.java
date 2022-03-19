package htmlGrammer.ValidationTests;

import htmlGrammer.Parser;
import static org.junit.jupiter.api.Assertions.*;
import java.io.StringReader;
import org.junit.jupiter.api.Test;

class Test4 {

	@Test
	// Right Test
	void test() {
		try {StringReader testString = new StringReader("ADD LINK WITH LINK \"www.facebook.com\" AND WITH TEXT \"Press Here To Go To Facebook\" AND WITH COLOR \"blue\" AND WITH FONT \"arial\" \n EXIT");
		Parser parser = new Parser(testString);
		parser.start();	
		}
		catch(Exception e){
			fail("Grammer is incorrect");
		}
	}

}
