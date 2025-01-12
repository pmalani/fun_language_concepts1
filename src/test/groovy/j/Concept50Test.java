package j;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class Concept50Test {

	private Concept50 val;
	
	@BeforeEach
	public void setup() {
		val = new Concept50();
	}
	
	// Notice the explicitly apply call
	@Test
	public void lambda() {
		assertThat(n(10), is(val.times.apply(n(2), n(5))));
	}
	
	@Test
	public void partialFunction() {
		UnaryOperator<Number> doubleMe = (a) -> val.times.apply(2, a);
		assertThat(n(10), is(doubleMe.apply(5)));
	}
	
	@Test
	public void closureAsParameter() {
		val.doSomethingUseful(5, a -> System.out.println(a));
		// full syntax
		val.doSomethingUseful(5, (Number a) -> { System.out.println(a); });		
	}
	
	@Test
	public void methodPointerAkaMethodReference() {
		val.doSomethingUseful(5, System.out::println);
	}
	
	@Test
	public void returnFunction2() {
		Supplier<Number> f = val.acc2(10);
		System.out.println(f.get());
		System.out.println(f.get());
		System.out.println(f.get());
	}
	
	Number n(int n) {
		return Double.valueOf(n);
	}

}
