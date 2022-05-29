# Text Blocks

* Java 15 (previewed in JDKs 13 and 14)
* [JEP-378](https://openjdk.java.net/jeps/378)

Add text blocks to the Java language. A text block is a multi-line
string literal that avoids the need for most escape sequences,
automatically formats the string in a predictable way, and gives the
developer control over the format when desired.

- Does the String#indent(int) work with text blocks?

## To use this module

Run the `PersonDeserializationTest` class in the `org.example`
package and observe that all the assertions pass indicating the
String value was properly deserialized into POJOs.

Look at the `PreTextBlockTest` class in the same package to see
what that String constant looked like without text blocks.
