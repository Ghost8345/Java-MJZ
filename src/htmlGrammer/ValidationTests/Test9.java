package htmlGrammer.ValidationTests;

import htmlGrammer.Parser;
import static org.junit.jupiter.api.Assertions.*;
import java.io.StringReader;
import org.junit.jupiter.api.Test;

class Test9 {

	@Test
	// Wrong Test
	void test() {
		try {StringReader testString = new StringReader("ADD ANY THING IS WRONG ");
		Parser parser = new Parser(testString);
		parser.start();	
		}
		catch(Exception e){
			fail("Grammer is incorrect");
		}
	}

}
