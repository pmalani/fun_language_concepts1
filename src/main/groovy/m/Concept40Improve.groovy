package m

import groovy.transform.Memoized;

import java.util.concurrent.TimeUnit;

class Concept40Improve {
	void printFibsUpto(int n) {
		for (int i =0; i < n; i++) {
			println fib(i)
		}
	}

	void measure(int n) {
		fib(n)
	}

	@Memoized
	int fib(int n) {
		if (n == 0)
			return 0
		if (n == 1)
			return 1
		return fib(n - 1) + fib(n - 2)
	}
}
