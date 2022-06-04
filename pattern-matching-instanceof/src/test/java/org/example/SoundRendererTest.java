package org.example;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SoundRendererTest {
  private SoundRenderer soundRenderer;

  @BeforeEach
  private void setup() {
    soundRenderer = new SoundRenderer();
  }

  @ParameterizedTest(name = "Validate getSound for object {0}")
  @MethodSource
  void testDisplayValueAndValidateEquality(final Object thing, final String expectedSound) {
    assertEquals(expectedSound, soundRenderer.getSound(thing));
  }

  private static Stream<Arguments> testDisplayValueAndValidateEquality() {
    return Stream.of(
        Arguments.of(new Car(), "vrooooooom!"),
        Arguments.of(new Cow(), "mooooooo"),
        Arguments.of(new ExplosiveCharge(), "kaboom!!!"),
        Arguments.of(new FriendlyPerson(), "hello")
    );
  }
}