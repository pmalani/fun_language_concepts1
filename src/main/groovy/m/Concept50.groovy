package m

class Concept50 {
	
	def times = {
		x, y -> x * y
	}
	
	void doSomethingUseful(int n, Closure c) {
		c(n)
	}
	
	def acc(int n) {
		return {
			-> n++
		}
	}
}
