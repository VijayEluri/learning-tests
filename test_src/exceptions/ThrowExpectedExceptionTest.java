package exceptions;

import org.junit.Test;

public class ThrowExpectedExceptionTest {

  @Test( expected = ArithmeticException.class )
  public void divisionByZeroShouldThrowArithmeticException() {
    int i = 1 / 0;
  }

  @Test( expected = ArrayIndexOutOfBoundsException.class )
  public void accessingElementAtIndexMinusOneShouldThrowAIOOBE() {
    int array = new int[] {}[ -1 ];
  }
}