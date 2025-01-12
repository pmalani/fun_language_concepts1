package m

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertEquals
import static org.junit.jupiter.api.Assertions.assertThrows

class Concept60Test {
	Concept60 val
	
	@BeforeEach
	void setup() {
		val = new Concept60()
	}

	@Test
	void fac() {
		assertEquals(1, val.factorial(1G))
		assertEquals(6, val.factorial(3G))
	}
	
	@Test
	void facLarge() {
		assertThrows(StackOverflowError.class, { -> println val.factorial(10000G) })
	}
	
	@Test
	void fac2() {
		assertEquals(1, val.factorial2(1G))
		assertEquals(6, val.factorial2(3G))
	}
	
	@Test
	void fac2Large() {
		assertThrows(StackOverflowError.class, { -> println val.factorial2(10000G) })
	}
}
