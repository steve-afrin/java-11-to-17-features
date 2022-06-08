# `switch` Expressions

* Java 14 (previewed in JDKs 12 and 13)
* [JEP-361](https://openjdk.java.net/jeps/361)
* [`switch` Expressions
(Baeldung)](https://www.baeldung.com/java-switch#switch-expressions)

`switch` statements use the `break` keyword to declare the
termination of execution in a `case` statement. Without the `break`
keyword, execution automatically flows through to the immediately
following `case` condition. A missed `break` statement on a
particular `case` condition can often be a source of bugs and bad
results.

`switch` expressions offer a safer way to use `switch` functionality
because they don't use the `break` keyword as each evaluation
yields a specific return value from the expression. The `yield`
keyword was initially introduced for this function until the newer
arrow notation was introduced.

Extend `switch` so it can be used as either a statement or an
expression, and so that both forms can use either traditional
`case ... :` labels (with fall through) or new `case ... ->` labels
(with no fall through), with a further new statement for yielding a
value from a switch expression.

## To use this module

Run the `QuarterEnumTest` class in the `org.example` package and
observe that all the tests pass the assertion of the expected
`QuarterEnum` value for the provided `Month` value.

Contrast and compare the ease of use between the older style
`switch` statement as illustrated in code in the
`QuarterEnumSwitchStatement` class and the newer style `switch`
expression as illustrated in the `QuarterEnum` class.