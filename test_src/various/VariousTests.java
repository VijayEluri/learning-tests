package various;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VariousTests {

  @Test
  public void testIntegerUnboxingUsingObjects() {
    Object[] arrayOfIntegers = new Object[] { 1, 2, 3 };

    assertEquals( arrayOfIntegers[ 0 ], 1 );
    assertEquals( arrayOfIntegers[ 1 ], 2 );
    assertEquals( arrayOfIntegers[ 2 ], 3 );
  }

  @Test
  public void testStringValueOfOnPrimitiveInteger() {
    assertEquals( "1", String.valueOf( 1 ) );
    assertEquals( "5", String.valueOf( 5 ) );
    assertEquals( "100", String.valueOf( 100 ) );
    assertEquals( "666", String.valueOf( 666 ) );
  }
}