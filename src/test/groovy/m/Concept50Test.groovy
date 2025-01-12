package m

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertEquals

class Concept50Test {
	private Concept50 val
	
	@BeforeEach
	void setup() {
		val = new Concept50()
	}
		
	@Test
	void partialFunction() {
		assertEquals(10, val.times(2, 5))
		
		def doubleMe = val.times.curry(2)
		assertEquals(10, doubleMe(5))
	}
	
	@Test
	void closureAsParameter() {
		val.doSomethingUseful(5, {
			x -> println x
		})
		val.doSomethingUseful(5) {
			x -> println x
		}
	}
	
	@Test
	void methodPointer() {
		val.doSomethingUseful(5, System.out.&println)
	}

	@Test
	void returnFunction() {
		def f = val.acc(10)
		println f()
		println f()
		println f()
	}
	
}
