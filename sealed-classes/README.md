# Sealed Classes

* Java 17 (previewed in JDKs 15 and 16)
* [JEP 409](https://openjdk.java.net/jeps/409)
* [Sealed Classes and Interfaces in Java 15
(Baeldung)](https://www.baeldung.com/java-sealed-classes-interfaces)

Provides a means to explicitly declare which classes and/or
interfaces may extend or implement them.

To demonstrate the usage of the new `permits` keyword to
implement both sealed classes as well as sealed interfaces,
this module uses the following three colors:

* Blue
* Green
* Red

which all extend the abstract `Color` class and the following four
shapes:

* Circle
* Rectangle
* Square
* Triangle

which each extend the `Shape` interface. It is worthwhile to note
that a square is obviously a subclass of rectangle, but the `Square`
class also necessarily needs to implement the `Shape` interface
because the `Shape` interface is sealed with a declaration to permit
the `Square` shape.

It is also worthwhile to note that the classes that either extend a
sealed class or implement a sealed interface necessarily need to
declare that class as one of:

* `final`
* `sealed`
* `non-sealed`

## To use this module

The execution of the main program is honestly quite boring. The
truly interesting part of this module is looking at the model
definitions for the colors which demonstrate usage of the new
sealed class and the shapes which demonstrate usage of the new
sealed interface.

Run the `CreateAndManipulateShapes` main file and you will see log
output at the `INFO` level that shows all the color instances being
created as expected and the interface methods in the implementation
classes behaving as expected.
