package htmlGrammer.GenerationTests;

import static org.junit.jupiter.api.Assertions.*;
import java.io.StringReader;
import org.junit.jupiter.api.Test;
import htmlGrammer.Parser;

class Test11 {

	@Test
	void test() throws  Exception {
		StringReader testString = new StringReader("ADD PARAGRAPH WITH TEXT \"Welcome to our program\" AND WITH COLOR \"magenta\" \n EXIT");
		Parser parser = new Parser(testString);
		assertEquals("<p style=\"color:magenta;\">Welcome to our program</p>", parser.start());
	}

}
