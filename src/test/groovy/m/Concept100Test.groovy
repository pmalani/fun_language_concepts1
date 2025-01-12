package m

import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertFalse
import static org.junit.jupiter.api.Assertions.assertTrue

class Concept100Test {

	@Test
	void usingOperator() {
		assertTrue "Bart" == "Bart"
	}
	
	@Test
	void usingOperator_withNew() {
		assertTrue "Bart" == new String("Bart")
	}
	
	@Test
	void usingMethod() {
		assertTrue "Bart".equals("Bart")
	}
	
	@Test
	void usingMethod_withNew() {
		assertTrue "Bart".equals(new String("Bart"))
	}

	@Test
	void usingIdentityOperator_withNew() {
		assertFalse "Bart" === new String("Bart")
	}

}
