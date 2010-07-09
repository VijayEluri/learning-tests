package preferences;

import static org.junit.Assert.assertEquals;

import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PreferencesTest {

  private Preferences _preferences;

  @Before
  public void setUp() {
    _preferences = Preferences.userNodeForPackage( this.getClass() );
  }

  @After
  public void tearDown() throws BackingStoreException {
    _preferences.removeNode();
  }

  // On Windows, these preferences are saved in the
  // Registry in HKCU/JavaSoft/Prefs/
  // On Linux, these are saved in ~/.java
  // For more info check this webpage:
  // http://mindprod.com/jgloss/preferences.html
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