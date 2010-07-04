package preferences;

import java.util.prefs.Preferences;

import junit.framework.TestCase;

import org.junit.Test;

public class PreferencesTest extends TestCase {

  @Test
  public void testCreation() {
    Preferences preferences = Preferences.userNodeForPackage( this.getClass() );
  }

  @Test
  public void testWritingAndReadingAnInt() {
    Preferences preferences = Preferences.userNodeForPackage( this.getClass() );
    int intValueForPreferencesTest = 5;
    String preferencesFieldName = "IntValueForPreferencesTest";
    preferences.putInt( preferencesFieldName, intValueForPreferencesTest );

    assertEquals( intValueForPreferencesTest, preferences.getInt( preferencesFieldName, 0 ) );
  }
}