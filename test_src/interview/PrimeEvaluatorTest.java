package interview;

import static org.junit.Assert.*;

import org.junit.*;

import various.*;

public class PrimeEvaluatorTest {

	private PrimeEvaluator evaluator;

	@Before
	public void setUp() {
		evaluator = new PrimeEvaluator();
	}

	@Test
	public void zeroShouldReturnFalse() {
		assertFalse(evaluator.isPrimeNumber(0));
	}

	@Test
	public void oneShouldReturnFalse() {
		assertFalse(evaluator.isPrimeNumber(1));
	}

	@Test
	public void twoShouldReturnTrue() {
		assertTrue(evaluator.isPrimeNumber(2));
	}

	@Test
	public void fourShouldReturnFalse() {
		assertFalse(evaluator.isPrimeNumber(4));
	}
}
