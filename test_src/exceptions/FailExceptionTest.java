package exceptions;

import static org.junit.Assert.fail;

import org.junit.Test;

public class FailExceptionTest {

  @Test
  public void exceptionShouldBeCaughtByCatch() {
    try {
      throwException();
      fail( "Shouldn't execute this line of code!!!" );
    } catch ( Exception ex ) {}
  }

  private void throwException() throws Exception {
    throw new Exception();
  }

  @Test( expected = AssertionError.class )
  public void expectingAnException() {
    try {
      doNotThrowException();
      fail( "Should execute this line of code!!!" );
    } catch ( Exception ex ) {}
  }

  private void doNotThrowException() {}
}