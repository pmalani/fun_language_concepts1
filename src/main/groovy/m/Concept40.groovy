package m

import java.util.concurrent.TimeUnit;

class Concept40 {
	void printFibsUpto(int n) {
		for (int i =0; i < n; i++) {
			println fib(i)
		}
	}

	// pure function?
	int fib(int n) {
		if (n == 0)
			return 0
		if (n == 1)
			return 1
		return fib(n - 1) + fib(n - 2)
	}
}
