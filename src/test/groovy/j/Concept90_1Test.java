package j;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Concept90_1Test {
	Concept90_1 val;
	
	@BeforeEach
	public void setup() {
		val = new Concept90_1();
	}
	
	@Test
	public void whenNull() {
		String name = null;
		assertThrows(NullPointerException.class, () -> val.say(name));
	}
	
	@Test
	public void yodaNull() {
		String name = null;
		val.yoda(name);		
	}
	
	@Test
	public void utilNull() {
		String name = null;
		val.util(name);
	}

}
