package m

import groovy.transform.TailRecursive;

class Concept60Improve {
//	@TailRecursive
//	def factorial(n) {
//		(n <=1) ? 1 : n * factorial(n - 1)
//	}
	
	@TailRecursive
	def factorial(n, acc = 1G) {
		if (n <= 1)
			return acc
		return factorial(n -1, n * acc)
	}
}
