package m

class Concept60 {
	def factorial(BigInteger n) {
		return (n <=1) ? 1 : n * factorial(n - 1)
	}
	
	def factorial2(BigInteger n, BigInteger acc = 1G) {
		if (n <= 1) 
			return acc
		return factorial2(n - 1, n * acc)
	}
}
