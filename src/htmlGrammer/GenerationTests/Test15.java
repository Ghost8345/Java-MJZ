package htmlGrammer.GenerationTests;

import static org.junit.jupiter.api.Assertions.*;
import java.io.StringReader;
import org.junit.jupiter.api.Test;
import htmlGrammer.Parser;

class Test15 {

	@Test
	void test() throws Exception {
		StringReader testString = new StringReader("ADD PARAGRAPH WITH COLOR \"blue\" AND WITH TEXT \"Hello World\" \n EXIT");
		Parser parser = new Parser(testString);
		assertEquals("<p style=\"color:blue;\">Hello World</p>", parser.start());
	}

}
