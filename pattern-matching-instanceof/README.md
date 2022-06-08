# Pattern Matching for `instanceof`

* Java 16 (previewed in JDKs 14 and 15)
* [JEP 394](https://openjdk.java.net/jeps/394)
* [Pattern Matching for instanceof in Java 14
(Baeldung)](https://www.baeldung.com/java-pattern-matching-instanceof)

Enhance the Java programming language with pattern matching for the
`instanceof` operator. Pattern matching allows common logic in a
program, namely the conditional extraction of components from
objects, to be expressed more concisely and safely.

This reduces the tedious habit of being required to cast to a
specific type before being allowed to access the API to extract the
desired data.

Take the case of a `Cow` class that implements the `moo()` method:

```java
if (object instanceof Cow) {
  final var cow = (Cow) object;
  cow.moo();
}
```

In this example, we are required to access the `Cow` class twice:
first to test the type of the passed in object and then again to
cast the passed in object to the `Cow` type in order to access the
`Cow` API. The usage exemplified here creates a temporary local
variable named `cow` that permits us a reference to access the
`Cow` API, specifically the desired `moo()` method.

Pattern matching for `instanceof` allows the much more concise
code to do this casting for us:

```java
if (object instanceof Cow cow) {
  cow.moo();
}
```

The variable `cow` has no reference outside of this `if` block and
the casting and assignment to the local variable `cow` is done if
and only when `object` is an actual instance of the `Cow` class.

## To use this module

Execute the `SoundRendererTest` and notice that it exercises the
`getSound(Object)` method of the `SoundRenderer` class. The tests
pass their assertions when the expected sound is returned from the
specific objects as defined by their respective API usages in the
`getSound(Object)` method.

Note that the various APIs for the different types of expected
objects are used by using the pattern matching feature for the
`instanceof` operator in the `getSound(Object) implementation.
