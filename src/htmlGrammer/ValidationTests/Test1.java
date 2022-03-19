package htmlGrammer.ValidationTests;

import htmlGrammer.Parser;
import static org.junit.jupiter.api.Assertions.*;
import java.io.StringReader;
import org.junit.jupiter.api.Test;

class Test1 {

	@Test
	// Right Test
	void test() {
		try {StringReader testString = new StringReader("ADD PARAGRAPH WITH TEXT \"Welcome to our program\" AND WITH COLOR \"magenta\" \n EXIT");
		Parser parser = new Parser(testString);
		parser.start();	
		}
		catch(Exception e){
			fail("Grammer is incorrect");
		}
	}

}
