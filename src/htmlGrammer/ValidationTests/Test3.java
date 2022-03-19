package htmlGrammer.ValidationTests;

import htmlGrammer.Parser;
import static org.junit.jupiter.api.Assertions.*;
import java.io.StringReader;
import org.junit.jupiter.api.Test;

class Test3 {

	@Test
	// Right Test
	void test() {
		try {StringReader testString = new StringReader("ADD HEADING WITH FONT \"arial\" AND WITH COLOR \"blue\" AND WITH TEXT \"Good Morning, Hope everything is going well with you\" \n EXIT");
		Parser parser = new Parser(testString);
		parser.start();	
		}
		catch(Exception e){
			fail("Grammer is incorrect");
		}
	}

}
