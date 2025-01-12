package m

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class Concept60ImproveTest {
	Concept60Improve val
	
	@BeforeEach
	void setup() {
		val = new Concept60Improve()
	}

	@Test
	void fac() {
		assert val.factorial(1) == 1
		assert val.factorial(3) == 6
	}
	
	@Test
	void facLarge() {
		String ans = val.factorial(10000).toString()
		println ans.size()
		println ans.substring(0, 10)
	}
}
