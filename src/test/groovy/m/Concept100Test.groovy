package m

import org.junit.jupiter.api.Test

class Concept100Test {

	@Test
	void usingOperator() {
		assert "Bart" == "Bart"
	}
	
	@Test
	void usingOperator_withNew() {
		assert "Bart" == new String("Bart")
	}
	
	@Test
	void usingMethod() {
		assert "Bart".equals("Bart")
	}
	
	@Test
	void usingMethod_withNew() {
		assert "Bart".equals(new String("Bart"))
	}
}
