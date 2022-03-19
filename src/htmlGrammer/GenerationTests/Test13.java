package htmlGrammer.GenerationTests;

import static org.junit.jupiter.api.Assertions.*;
import java.io.StringReader;
import org.junit.jupiter.api.Test;
import htmlGrammer.Parser;

class Test13 {

	@Test
	void test() throws Exception {
		StringReader testString = new StringReader("ADD LINK WITH TEXT \"Click Me\" AND WITH LINK \"https://www.facebook.com\" AND WITH COLOR \"blue\" AND WITH FONT \"arial\" \n EXIT");
		Parser parser = new Parser(testString);
		assertEquals("<a href=\"https://www.facebook.com\" style=\"color:blue;font-family:arial;\">Click Me</a>", parser.start());
	}

}
