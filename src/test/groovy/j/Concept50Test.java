package j;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import org.junit.Before;
import org.junit.Test;

public class Concept50Test {
	private Concept50 val;
	
	@Before
	public void setup() {
		val = new Concept50();
	}
	
	// Notice the explicitly apply call
	@Test	
	public void lambda() {
		assertThat(i(10), is(val.times.apply(i(2),i(5))));		
	}
	
	@Test
	public void partialFunction() {
		UnaryOperator<Number> doubleMe = (a) -> val.times.apply(2, a);
		assertThat(i(10), is(doubleMe.apply(5)));		
	}
	
	@Test
	public void closureAsParameter() {
		val.doSomethingUseful(5, a -> System.out.println(a));
		// full syntax
		val.doSomethingUseful(5, (Number a) -> { System.out.println(a); });		
	}
	
	@Test
	public void methodPointerAKAmethodReference() {
		val.doSomethingUseful(5, System.out::println);
	}
	
	@Test
	public void returnFunction2() {
		Supplier<Number> f = val.acc2(10);
		System.out.println(f.get());
		System.out.println(f.get());
		System.out.println(f.get());
	}
	
	Number i(int i) {
		return new Double(i);
	}

}
