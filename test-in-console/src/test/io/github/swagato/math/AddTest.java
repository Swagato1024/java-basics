package io.github.swagato.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AddTest {
  @Test
  void shouldAddTwoNumbers() {
    final int a = 10;
    final int b = 20;

    assertEquals(30, Add.addTwo(a, b));
  }
}