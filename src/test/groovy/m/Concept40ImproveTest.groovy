package m

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class Concept40ImproveTest {
	Concept40Improve val
	
	@BeforeEach
	void setup() {
		val = new Concept40Improve()
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
