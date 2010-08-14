package interview;

import static org.junit.Assert.*;

import org.junit.*;

import various.*;

public class PasswordValidatorTest {
	private PasswordValidator validator;

	@Before
	public void setUp() {
		validator = new PasswordValidator();
	}

	@Test
	public void passwordShorterThenMinLengthIsNotValid() {
		assertFalse(validator.isValidPassword(""));
	}

	@Test
	public void passwordLongerThenMinLengthIsValid() {
		assertTrue(validator.isValidPassword("aBc123"));
	}

	@Test
	public void passwordThatContainsNonAlphaNumericCharsIsNotValid() {
		assertFalse(validator.isValidPassword("abc123@"));
	}

	@Test
	public void passwordThatContainsOnlyAlphaNumericCharsIsValid() {
		assertTrue(validator.isValidPassword("abcD1234"));
	}

	@Test
	public void passwordThatDoesNotContainOneUppercaseLetterIsNotValid() {
		assertFalse(validator.isValidPassword("abcdef"));
	}

	@Test
	public void passwordThatDoesNotContainOneLowercaseLetterisNotValid() {
		assertFalse(validator.isValidPassword("ABC1234"));
	}
}
