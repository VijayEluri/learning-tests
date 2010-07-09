package systemproperties;

import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

public class SystemPropertiesTest {

  private Properties _properties;

  @Before
  public void setUp() {
    _properties = System.getProperties();
  }

  @Test
  public void testListingProperties() {
    _properties.list( System.out );
  }
}