package j;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class Concept50 {
	BiFunction<Number, Number, Number> times = (x, y) -> x.doubleValue()
			* y.doubleValue();

	void doSomethingUseful(int n, Consumer<Number> consumer) {
		consumer.accept(n);
	}

	// Final and Effectively Final
	Supplier<Number> acc(Number n) {
		return (() -> {
//			n = n.doubleValue() + 1;
			return n;
		});
	}
	
	Supplier<Number> acc2(Number n) {
		return new Supplier<Number>() {
			Number myN = n;

			@Override
			public Number get() {
				Number ret = myN;
				myN = myN.doubleValue() + 1;
				return ret;
			}
		};
	}

}
