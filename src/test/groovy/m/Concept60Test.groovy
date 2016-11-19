package m

import org.junit.Before;
import org.junit.Test;

class Concept60Test {
	Concept60 val
	
	@Before
	void setup() {
		val = new Concept60()
	}

	@Test
	void fac() {
		assert val.factorial(1) == 1
		assert val.factorial(3) == 6
	}
	
	@Test(expected = StackOverflowError.class)
	void facLarge() {
		println val.factorial(10000)
	}
	
	@Test
	void fac2() {
		assert val.factorial2(1) == 1
		assert val.factorial2(3) == 6
	}
	
	@Test(expected = StackOverflowError.class)
	void fac2Large() {
		println val.factorial2(10000)
	}
}
