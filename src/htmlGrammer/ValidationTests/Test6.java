package htmlGrammer.ValidationTests;

import htmlGrammer.Parser;
import static org.junit.jupiter.api.Assertions.*;
import java.io.StringReader;
import org.junit.jupiter.api.Test;

class Test6 {

	@Test
	// Right Test
	void test() {
		try {StringReader testString = new StringReader("ADD IMAGE WITH SOURCE \"../downloads/photo.jpg\" \n EXIT");
		Parser parser = new Parser(testString);
		parser.start();	
		}
		catch(Exception e){
			fail("Grammer is incorrect");
		}
	}

}
