package interview;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

  private FizzBuzz _fizzBuzz;

  @Before
  public void setUp() {
    _fizzBuzz = new FizzBuzz();
  }

  @Test
  public void testWithOneShouldBeOne() {
    assertEquals( 1, _fizzBuzz.isFizzOrBuzz( 1 ) );
  }

  @Test
  public void testWithThreeShouldBeFizz() {
    assertEquals( "Fizz", _fizzBuzz.isFizzOrBuzz( 3 ) );
  }

  @Test
  public void testWithFiveShouldBeBuzz() {
    assertEquals( "Buzz", _fizzBuzz.isFizzOrBuzz( 5 ) );
  }

  @Test
  public void testWithFifteenShouldBeFizzBuzz() {
    assertEquals( "FizzBuzz", _fizzBuzz.isFizzOrBuzz( 15 ) );
  }

  @Test
  public void testWithTwentyShouldBeBuzz() {
    assertEquals( "Buzz", _fizzBuzz.isFizzOrBuzz( 20 ) );
  }

  @Test
  public void testWithFortyShouldBeBuzz() {
    assertEquals( "Buzz", _fizzBuzz.isFizzOrBuzz( 40 ) );
  }
}