package interview;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTest {
	@Test
	public void validPalindrome() {
		assertTrue(new Palindrome().isPalindrome("ABA"));
	}

	@Test
	public void invalidPalindrome() {
		assertFalse(new Palindrome().isPalindrome("ABC"));
	}
}
