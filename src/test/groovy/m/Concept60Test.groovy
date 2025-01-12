package m

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertThrows;

class Concept60Test {
	Concept60 val
	
	@BeforeEach
	void setup() {
		val = new Concept60()
	}

	@Test
	void fac() {
		assert val.factorial(1) == 1
		assert val.factorial(3) == 6
	}
	
	@Test
	void facLarge() {
		assertThrows(StackOverflowError.class, { -> println val.factorial(10000) })
	}
	
	@Test
	void fac2() {
		assert val.factorial2(1) == 1
		assert val.factorial2(3) == 6
	}
	
	@Test
	void fac2Large() {
		assertThrows(StackOverflowError.class, { -> println val.factorial2(10000) })
	}
}
