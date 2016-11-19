package m

import org.junit.Before;
import org.junit.Test;

class Concept40ImproveTest {
	Concept40Improve val
	
	@Before
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
