package m

import j.Concept90_2.LineItem
import org.junit.jupiter.api.Test

class Concept90_2Test {
	// using safe navigation operator
	@Test
	void givenLineItemGetProductTypeDescription() {
		LineItem item = new LineItem()
		def type = item?.product?.productType
		if (type)
			println type.description
	}

	// using elvis operator
	void say(String what) {
		println what ?: "?"
	}
	
	@Test
	void sayNull() {
		say('Bart')
		say(null)
	}
}
