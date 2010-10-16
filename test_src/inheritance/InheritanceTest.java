package inheritance;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InheritanceTest {

	@Test
	public void testDerivedClassWithBaseClass() {
		BaseClass myClass = new DerivedClass();
		assertEquals(6, myClass.y());
		assertEquals(2, myClass.x());
	}

	@Test
	public void testDerivedClassAlone() {
		DerivedClass derivedClass = new DerivedClass();
		assertEquals(6, derivedClass.y());
		assertEquals(3, derivedClass.x());
	}
}