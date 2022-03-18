/* Generated By:JavaCC: Do not edit this line. ParserConstants.java */
package htmlGrammer;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int QUOTE = 4;
  /** RegularExpression Id. */
  int EOL = 5;
  /** RegularExpression Id. */
  int QUOTED_STRING = 6;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "<QUOTE>",
    "\"\\n\"",
    "<QUOTED_STRING>",
    "\"EXIT\"",
    "\"ADD\"",
    "\"PARAGRAPH\"",
    "\"HEADING\"",
    "\"LINK\"",
    "\"IMAGE\"",
    "\"WITH\"",
    "\"SOURCE\"",
    "\"COLOR\"",
    "\"FONT\"",
    "\"TEXT\"",
    "\"AND\"",
  };

}