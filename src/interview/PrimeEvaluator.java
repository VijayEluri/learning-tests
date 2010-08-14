package interview;

public class PrimeEvaluator {

	public boolean isPrimeNumber(int value) {
		if (value < 2)
			return false;
		for (int i = 2; i <= value / 2; i++)
			if (value % i == 0)
				return false;

		return true;
	}
}
