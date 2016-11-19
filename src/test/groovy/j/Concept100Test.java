package j;

import static org.junit.Assert.*;

import org.junit.Test;

public class Concept100Test {
	
	@Test
	public void usingOperator() {
		assertTrue("Bart" == "Bart");
	}
	
	@Test
	public void usingOperator_withNew() {
		assertFalse("Bart" == new String("Bart"));
	}

	@Test
	public void usingMethod() {
		assertTrue("Bart".equals("Bart"));
	}

	@Test
	public void usingMethod_withNew() {
		assertTrue("Bart".equals(new String("Bart")));
	}

}
