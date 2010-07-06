package dumbtest;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest extends TestCase {

  private FizzBuzz _fizzBuzz;

  @Before
  @Override
  public void setUp() {
    _fizzBuzz = new FizzBuzz();
  }

  @Test
  public void testWithOne() {
    assertEquals( 1, _fizzBuzz.isFizzOrBuzz( 1 ) );
  }

  @Test
  public void testWithThree() {
    assertEquals( "Fizz", _fizzBuzz.isFizzOrBuzz( 3 ) );
  }

  @Test
  public void testWithFive() {
    assertEquals( "Buzz", _fizzBuzz.isFizzOrBuzz( 5 ) );
  }

  @Test
  public void testWithFifteen() {
    assertEquals( "FizzBuzz", _fizzBuzz.isFizzOrBuzz( 15 ) );
  }

  @Test
  public void testWithTwenty() {
    assertEquals( "Buzz", _fizzBuzz.isFizzOrBuzz( 20 ) );
  }

  @Test
  public void testWithForty() {
    assertEquals( "Buzz", _fizzBuzz.isFizzOrBuzz( 40 ) );
  }
}