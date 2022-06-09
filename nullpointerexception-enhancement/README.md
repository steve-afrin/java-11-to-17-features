# `NullPointerException` Enhancement

* Java 14
* [JEP 358](https://openjdk.java.net/jeps/358)
* [Helpful NullPointerExceptions in Java 14
(Baeldung)](https://www.baeldung.com/java-14-nullpointerexception)

Since the original days of Java, the `NullPointerException` has been
one of the most common runtime exceptions thrown and sometimes among
the most difficult to troubleshoot. Consider this line of source
code:

```java
var x = this.compute(a.getValue(), b.getValue(), c.getValue());
```

This code obviously calls three functions for which we have no idea
what the implementation or desired result is, but imagine that in
this line, any one of those `getValue()` function calls can generate
a `NullPointerException` where we don't expect or handle it.

Pre-JDK 14, the default `NullPointerException` error message would
just inform us of this line where the exception happened, and as
developers, we'd have to figure out which of the functions is
generating the exception. We might add log statements or assertions
to the code to figure this out.

Now in JDK 14 and later, the default error message tells us exactly
which element on the line in question contains the unexpected `null`
value.

## Two ways to use this module

### Normal Program Flow/Execution in the JVM

Run the `UncaughtExceptionExample` class in the `org.example`
package. This class demonstrates how the new `NullPointerException`
class is thrown with a default message that provides details of the
exact cause of the exception.

This class logs a couple statements to the console in normal program
execution flow in the JVM before making a third attempt to log a
statement that calls a function that triggers the uncaught/unhandled
`NullPointerException`.

### Validate expected `NullPointerException` instances in a JUnit 5 test

Run the `CalculatorTest` class in the `org.example` package and
observe that all the tests pass the assertion of the expected
enhanced error message from the generated `NullPointerException`.

Also observe the `WARN` level output in the logs to see examples of
the `NullPointerException` stack trace that is now generated with
the enhanced error message.
