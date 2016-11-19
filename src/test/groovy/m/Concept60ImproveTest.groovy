package m

import org.junit.Before;
import org.junit.Test;

class Concept60ImproveTest {
	Concept60Improve val
	
	@Before
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
