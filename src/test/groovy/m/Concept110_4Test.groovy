package m

import m.Concept110_4.BorderedButton1
import m.Concept110_4.BorderedButton2
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertEquals

class Concept110_4Test {
	Concept110_4 obj
	
	@BeforeEach
	void setup() {
		obj = new Concept110_4()
	}
	
	@Test
	void test_BorderedButton1() {
		BorderedButton1 one = new BorderedButton1()
		assertEquals(1,  one.getXCoordinate())
	}
	
	@Test
	void test_BorderedButton2() {
		BorderedButton2 one = new BorderedButton2()
		assertEquals(0, one.getXCoordinate())
	}

}
