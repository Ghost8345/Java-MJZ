package htmlGrammer.GenerationTests;

import static org.junit.jupiter.api.Assertions.*;
import java.io.StringReader;
import org.junit.jupiter.api.Test;
import htmlGrammer.Parser;

class Test14 {

	@Test
	void test() throws Exception {
		StringReader testString = new StringReader("ADD HEADING WITH TEXT \"Good Morning\" AND WITH COLOR \"SlateBlue\" \n EXIT");
		Parser parser = new Parser(testString);
		assertEquals("<h1 style=\"color:SlateBlue;\">Good Morning</h1>", parser.start());
	}

}
