package systemproperties;

import java.util.Properties;

import junit.framework.TestCase;

import org.junit.Test;

public class SystemPropertiesTest extends TestCase {

  @Test
  public void testCreation() {
    Properties properties = System.getProperties();
  }

  @Test
  public void testListProperties() {
    Properties properties = System.getProperties();
    properties.list( System.out );
  }
}