package j;

public class Concept110_3 {

	interface Person {
		String getName();
	}
	
	interface Buyer extends Person {
		default void buy() {
			System.out.println("buying...");
		}
	}
	
	interface Seller extends Person {
		default void sell() {
			System.out.println("selling...");
		}
	}
	
	class Broker implements Buyer, Seller  {
		String name;
		
		@Override
		public String getName() {
			return name;
		}		
	}

}
