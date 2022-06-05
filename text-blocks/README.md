# Text Blocks

* Java 15 (previewed in JDKs 13 and 14)
* [JEP-378](https://openjdk.java.net/jeps/378)

Add text blocks to the Java language. A text block is a multi-line
string literal that avoids the need for most escape sequences,
automatically formats the string in a predictable way, and gives the
developer control over the format when desired.

* The new `indent()` function on the `String` class works with text
  blocks and adds the indentation to each individual line of the
  text block.
* Text blocks can be a great way to _templatize_ multiline JSON,
  SQL, or XML using the `format()` function on the `String` class.
* A text block can be a nice way to use a multiline SQL statement to
  create a JDBC `PreparedStatement` instance.
* Any method that works on a `String` instance works on a text block
  because a text block is just a multiline `String` instance.

## To use this module

Run the `PersonDeserializationTest` class in the `org.example`
package and observe that all the assertions pass indicating the
String value was properly deserialized into POJOs.

Look at the `PreTextBlockTest` class in the same package to see
what that String constant looked like without text blocks.
