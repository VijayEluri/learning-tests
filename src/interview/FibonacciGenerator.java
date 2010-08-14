package interview;

public class FibonacciGenerator {

	public int getNthFibonacci(int n) {
		if (n == 1)
			return 0;
		if (n == 2)
			return 1;
		return getNthFibonacci(n - 1) + getNthFibonacci(n - 2);
	}

}
