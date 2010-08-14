package interview;

import static org.junit.Assert.*;

import org.junit.*;

public class FrequencyCalculatorTest {
	private FrequencyCalculator calculator;

	@Before
	public void setUp() {
		calculator = new FrequencyCalculator();
	}

	@Test
	public void getFrequencyCalledWithEmptyArrayShouldThrowException() {
		try {
			calculator.getFrequency(new int[] {});
			fail();
		} catch (RuntimeException e) {
			assertEquals("The array is empty. There is no value you can get!",
					e.getMessage());
		}
	}

	@Test
	public void getFrequencyShouldReturnTheSingleElementFromArray() {
		assertEquals(2, calculator.getFrequency(new int[] { 2 }));
	}

	@Test
	public void getFrequencyShouldReturnTheMostFrequentValue() {
		assertEquals(3, calculator.getFrequency(new int[] {
				3, 4, 3 }));
	}

	@Test
	public void getFrequencyShouldReturnTheMostFrequentValue2() {
		assertEquals(2, calculator.getFrequency(new int[] {
				2, 3, 4, 2, 3, 2 }));
	}

	@Test
	public void getFrequencyShouldReturnTheFirstAppearingValueWhenTie() {
		assertEquals(2, calculator.getFrequency(new int[] {
				2, 5, 5, 2, 4, 9, 4, 9 }));
	}
}
