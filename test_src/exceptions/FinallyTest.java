package exceptions;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class FinallyTest {
  
  @Test
  public void testWhichReturnIsExecutedFirst() {
    assertEquals("return from finally", whichReturnIsExecutedFirst());
  }
  
  private String whichReturnIsExecutedFirst() {
    try {
      return "return from try";
    } finally {
      return "return from finally";
    }
  }
  
  @Test
  public void testWhichAppendIsFirst() {
    StringBuilder sb = new StringBuilder();
    whichAppendIsFirstWhenNoExceptionsAreThrownInTry(sb);
    assertEquals("append from try, append from finally", sb.toString());
    
  }
  
  private void whichAppendIsFirstWhenNoExceptionsAreThrownInTry(StringBuilder sb) {
    try {
      sb.append("append from try, ");
    } finally {
      sb.append("append from finally");
    }
  }
  
  @Test
  public void testWhichAppendsAreDoneWhenOneExceptionIsThrownInTry() {
    StringBuilder sb = new StringBuilder();
    try {
      whichAppendsAreDoneWhenOneExceptionIsThrownInTry(sb);
    } catch (Exception e) {
      sb.append("exception caught in test method");
    }
    assertEquals("first append from try, append from finally, exception caught in test method", sb.toString());
  }
  
  private void whichAppendsAreDoneWhenOneExceptionIsThrownInTry(StringBuilder sb) {
    try {
      sb.append("first append from try, ");
      throwException();
      sb.append("second append from try, ");
    } finally {
      sb.append("append from finally, ");
    }
  }
  
  private int throwException() {
    throw new RuntimeException("exception");
  }
  
  @Test
  public void testWhichAppendsAreDoneWhenThrowingExceptionsFromFinally() {
    StringBuilder sb = new StringBuilder();
    try {
      whichAppendsAreDoneWhenThrowingExceptionsFromFinally(sb);
    } catch (Exception e) {
      sb.append("exception caught in test method");
    }
    assertEquals("append from try, append in finally before exception, exception caught in test method", sb.toString());
  }
  
  private void whichAppendsAreDoneWhenThrowingExceptionsFromFinally(StringBuilder sb) {
    try {
      sb.append("append from try, ");
    } finally {
      sb.append("append in finally before exception, ");
      throwException();
      sb.append("append in finally after exception, ");
    }
  }

  @Test
  public void testWhichIsDoneReturnInFinallyOrReturnInTry() {
    int value = 0;
    try {
      value = whichIsDoneReturnInFinallyOrReturnInTry();
    } catch (Exception e) {
//      fail("");
    }
    assertEquals(666, value);
  }
  
  private int whichIsDoneReturnInFinallyOrReturnInTry() {
    try {
      return throwException();
    } finally {
      return 666;
    }
  }
}
