package interview;

import static org.junit.Assert.*;

import org.junit.*;

public class StaticsTest {

	@Test
	public void testStatics() {
		Statics statics1 = new Statics();
		new Statics();
		Statics statics2 = statics1;
		assertEquals(2, statics2.i);
		assertEquals(1, statics2.j);
		assertEquals(3, statics2.i + statics2.j);
	}
}
