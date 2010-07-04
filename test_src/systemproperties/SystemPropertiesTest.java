package systemproperties;

import java.util.Properties;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class SystemPropertiesTest extends TestCase {

  private Properties _properties;

  @Before
  @Override
  public void setUp() {
    _properties = System.getProperties();
  }

  @Test
  public void testListingProperties() {
    _properties.list( System.out );
  }
}