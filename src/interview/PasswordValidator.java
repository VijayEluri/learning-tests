package interview;

public class PasswordValidator {

	private static final int MIN_DEFAULT_PASSWORD_LENGTH = 6;
	private int _minPasswordLength;

	public PasswordValidator() {
		this(MIN_DEFAULT_PASSWORD_LENGTH);
	}

	public PasswordValidator(int minPasswordLength) {
		_minPasswordLength = minPasswordLength;
	}

	public boolean isValidPassword(String password) {
		if (!hasMinLength(password))
			return false;
		if (!isAlphaNumeric(password))
			return false;
		if (!hasAtLeastOneUppercaseLetter(password))
			return false;
		if (!hasAtLeastOneLowercaseLetter(password))
			return false;

		return true;
	}

	private boolean hasAtLeastOneLowercaseLetter(String password) {
		char[] chars = password.toCharArray();
		for (char c : chars)
			if (Character.isLowerCase(c))
				return true;
		return false;
	}

	private boolean hasAtLeastOneUppercaseLetter(String password) {
		char[] chars = password.toCharArray();
		for (char c : chars)
			if (Character.isUpperCase(c))
				return true;
		return false;
	}

	private boolean isAlphaNumeric(String password) {
		char[] chars = password.toCharArray();
		for (char c : chars)
			if (!Character.isDigit(c) && !Character.isLetter(c))
				return false;
		return true;
	}

	private boolean hasMinLength(String password) {
		if (password.length() < _minPasswordLength)
			return false;
		return true;
	}
}
