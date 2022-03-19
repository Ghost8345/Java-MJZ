package htmlGrammer.ValidationTests;

import htmlGrammer.Parser;
import static org.junit.jupiter.api.Assertions.*;
import java.io.StringReader;
import org.junit.jupiter.api.Test;

class Test8 {

	@Test
	// Right Test
	void test() {
		try {StringReader testString = new StringReader("ADD HEADING WITH COLOR \"grey\" AND WITH FONT \"arial\" AND WITH TEXT \"Good Luck\" \n EXIT");
		Parser parser = new Parser(testString);
		parser.start();	
		}
		catch(Exception e){
			fail("Grammer is incorrect");
		}
	}

}
