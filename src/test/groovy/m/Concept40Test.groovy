package m

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class Concept40Test {
	Concept40 val
	
	@BeforeEach
	void setup() {
		val = new Concept40()
	}

	@Test
	void printUpto10() {
		val.printFibsUpto(10)
	}
	
	@Test
	void measure() {
		val.fib(45)
	}

}
