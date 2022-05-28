# Records

* Java 16 (previewed in JDKs 14 and 15)
* [JEP 395](https://openjdk.java.net/jeps/395)

Reduces a bunch of boilerplate code that is just not necessary for
transparent carriers of immutable data.

Record classes and their attributes are always `final` (by
definition) and can never be `abstract`. There is no need to
implement standard functions for POJOs like `equals`, `hashCode`, or
`toString` The constructor and accessor methods are implicitly
defined by the definition of the record class.

Enhance the Java programming language with records, which are
classes that act as transparent carriers for immutable data. Records
can be thought of as nominal tuples.
