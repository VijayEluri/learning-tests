package mocking;

import java.awt.List;
import java.util.Map;

import org.junit.Test;
import org.mockito.exceptions.verification.NeverWantedButInvoked;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class MockitoTest {

  @Test
  public void testMocking() {
    List list = mock( List.class );
    list.add( "one" );
    verify( list ).add( "one" );
    verify( list, never() ).add( "two" );
  }

  @Test( expected = NeverWantedButInvoked.class )
  public void verifyCalledWithNeverShouldThrowException() {
    Map<Integer, String> map = mock( Map.class );
    map.put( 1, "one" );
    map.put( 3, "three" );
    verify( map, never() ).put( 3, "three" );
  }
}
