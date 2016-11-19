package m

import org.junit.Before;
import org.junit.Test;

class Concept40Test {
	Concept40 val
	
	@Before
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
