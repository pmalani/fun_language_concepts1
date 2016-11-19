package j;

import org.junit.Before;
import org.junit.Test;

public class Concept90_1Test {
	Concept90_1 val;
	
	@Before
	public void setup() {
		val = new Concept90_1();
	}
	
	@Test(expected = NullPointerException.class)
	public void whenNull() {
		String name = null;
		val.say(name);
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
