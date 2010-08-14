package interview;

import static org.junit.Assert.*;

import org.junit.*;

import various.*;

public class FibonacciGeneratorTest {
	private FibonacciGenerator generator;

	@Before
	public void setUp() {
		generator = new FibonacciGenerator();
	}

	@Test
	public void oneShouldReturnZero() {
		assertEquals(0, generator.getNthFibonacci(1));
	}
	
	@Test
	public void twoShouldReturnOne() {
		assertEquals(1, generator.getNthFibonacci(2));
	}
	
	@Test
	public void threeShouldReturnOne() {
		assertEquals(1, generator.getNthFibonacci(3));
	}
	
	@Test
	public void fourShouldReturnTwo() {
		assertEquals(2, generator.getNthFibonacci(4));
	}
	
	@Test
	public void tenShouldReturnThirtyFour() {
		assertEquals(34, generator.getNthFibonacci(10));
	}
	
	@Test
	public void fifteenShouldReturnThreeHundredSeventySeven() {
		assertEquals(377, generator.getNthFibonacci(15));
	}
}
