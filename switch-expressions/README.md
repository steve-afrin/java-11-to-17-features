# Switch Expressions

* Java 14 (previewed in JDKs 12 and 13)
* [JEP-361](https://openjdk.java.net/jeps/361)

Switch statements use the `break` keyword to declare the termination
of execution in a `case` statement. Without the `break` keyword,
execution automatically flows through to the immediately following
`case` condition. A missed `break` statement on a particular `case`
condition can often be a source of bugs and bad results.

Switch expressions offer a safer way to use `switch` functionality
because they don't use the `break` keyword as each evaluation
yields a specific return value from the expression. The `yield`
keyword was initially introduced for this function until the newer
arrow notation was introduced.

Extend `switch` so it can be used as either a statement or an
expression, and so that both forms can use either traditional
`case ... :` labels (with fall through) or new `case ... ->` labels
(with no fall through), with a further new statement for yielding a
value from a switch expression.