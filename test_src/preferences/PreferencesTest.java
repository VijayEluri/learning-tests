package preferences;

import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PreferencesTest extends TestCase {

  private Preferences _preferences;

  @Before
  @Override
  public void setUp() {
    _preferences = Preferences.userNodeForPackage( this.getClass() );
  }

  @After
  @Override
  public void tearDown() throws BackingStoreException {
    _preferences.removeNode();
  }

  @Test
  public void testWritingAndReadingAnIntWhenKeyExists() {
    int intValue = 5;
    int defaultValue = 0;
    String keyName = "IntValueForPreferencesTest";
    _preferences.putInt( keyName, intValue );
    assertEquals( intValue, _preferences.getInt( keyName, defaultValue ) );
  }

  @Test
  public void testReadingAnIntWhenKeyDoesntExist() {
    int defaultValue = 0;
    String keyName = "IntValueForPreferencesTest";
    assertEquals( defaultValue, _preferences.getInt( keyName, defaultValue ) );
  }
}