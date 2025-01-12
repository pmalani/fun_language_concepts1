package m

import j.Concept90_2.LineItem
import org.junit.jupiter.api.Test;


class Concept90_2Test {
	@Test
	void givenLineItemGetProductTypeDescription() {
		LineItem item = new LineItem()
		def type = item?.product?.productType
		if (type)
			println type.description
	}
	
	void say(String what) {
		println what ?: "?"
	}
	
	@Test
	void sayNull() {
		say('Bart')
		say(null)
	}
}
