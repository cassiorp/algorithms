import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.example.recursion.Recursion;
import org.junit.jupiter.api.Test;

public class RecursionTest {

  Recursion recursion = new Recursion();

  @Test
  public void shouldReturn1With0Recursion() {
    int fact = recursion.fact(0);
    assertEquals(1, fact);
  }

  @Test
  public void shouldReturn1with1Recursion() {
    int fact = recursion.fact(1);
    assertEquals(1, fact);
  }

  @Test
  public void shouldReturn24with4Recursion() {
    int fact = recursion.fact(4);
    assertEquals(24, fact);
  }

  @Test
  public void shouldReturnFibonacciListUntil8() {
    List<Integer> fibonacci = recursion.fibonacci(8);
    List<Integer> expected = List.of(1, 1, 2, 3, 5, 8, 13, 21);
    assertEquals(expected, fibonacci);
  }

  @Test
  public void shouldReturn3WithFibonacciRecursion() {
    int fibonaccied = recursion.fibonacciRecursion(4);
    assertEquals(3, fibonaccied);
  }
}
