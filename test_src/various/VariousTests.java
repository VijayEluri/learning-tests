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
    assertEquals( String.valueOf( 1 ), "1" );
    assertEquals( String.valueOf( 5 ), "5" );
    assertEquals( String.valueOf( 100 ), "100" );
    assertEquals( String.valueOf( 666 ), "666" );
  }
}