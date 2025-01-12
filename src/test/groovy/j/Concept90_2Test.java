package j;


import j.Concept90_2.LineItem;
import j.Concept90_2.Product;
import j.Concept90_2.ProductType;
import org.junit.jupiter.api.Test;

public class Concept90_2Test {

	@Test
	public void givenLineItemGetProductTypeDescription() {
		LineItem item = new LineItem();
		Product product = item.getProduct();
		if (product != null) {
			ProductType type = product.getProductType();
			if (type != null) {
				System.out.println(type.getDescription());
			}
		}
	}
	
	void say(String what) {
		System.out.println(what == null ? "?" : what);
	}
	
	@Test
	public void sayNull() {
		say("Bart");
		say(null);
	}
}
