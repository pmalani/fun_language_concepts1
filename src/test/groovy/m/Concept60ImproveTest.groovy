package m

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertEquals

class Concept60ImproveTest {
	Concept60Improve val
	
	@BeforeEach
	void setup() {
		val = new Concept60Improve()
	}

	@Test
	void fac() {
		assertEquals(1, val.factorial(1))
		assertEquals(6, val.factorial(3))
	}
	
	@Test
	void facLarge() {
		String ans = val.factorial(10000).toString()
		println ans.size()
		println ans.substring(0, 10)
	}
}
