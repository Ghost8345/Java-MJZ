package htmlGrammer.ValidationTests;

import htmlGrammer.Parser;
import static org.junit.jupiter.api.Assertions.*;
import java.io.StringReader;
import org.junit.jupiter.api.Test;

class Test10 {

	@Test
	// Right Test
	void test() {
		try {StringReader testString = new StringReader("ADD LINK WITH TEXT \"Please Click Me\" AND WITH COLOR \"magenta\" AND WITH FONT \"arial\" AND WITH LINK \"www.thegoodlife.com\" \n"
				+ "ADD PARAGRAPH WITH TEXT \"Be Positive As Much As You Can\" AND WITH COLOR \"red\" AND WITH FONT \"arial\" \n"
				+ "ADD HEADING WITH FONT \"Trebuchet MS\" AND WITH COLOR \"Violet\" AND WITH TEXT \"Better Days Are Coming\" \n"
				+ "ADD IMAGE WITH SOURCE \"c/users/your/name/photos/photo.jpg\" \n"
				+ "ADD LINK WITH COLOR \"SlateBlue\" AND WITH FONT \"Times New Roman\" AND WITH LINK \"safe.com\" AND WITH TEXT \"HAVE FAITH\" \n EXIT");
		Parser parser = new Parser(testString);
		parser.start();	
		}
		catch(Exception e){
			fail("Grammer is incorrect");
		}
	}

}
