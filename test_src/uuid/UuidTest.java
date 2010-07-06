package uuid;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import java.util.UUID;

import junit.framework.TestCase;

import org.junit.Test;

public class UuidTest extends TestCase {

  @Test
  public void testCreation() {
    UUID uuid = new UUID( Long.MAX_VALUE, Long.MIN_VALUE );
    assertNotNull( uuid );
  }

  @Test
  public void testRandomIdentifier() {
    UUID uuid1 = UUID.randomUUID();
    UUID uuid2 = UUID.randomUUID();
    assertThat( uuid1, is( not( uuid2 ) ) );
  }

  @Test
  public void testCompareIdentifierWithString() {
    UUID uuid = UUID.randomUUID();
    String uuidString = uuid.toString();
    assertEquals( uuid, UUID.fromString( uuidString ) );
  }
}