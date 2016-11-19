package m

class Concept110_2 {

	trait Person {
		abstract String getName()
	}
	
	trait Buyer extends Person {
		void buy() {
			println "buying..."	
		}		
	}
	
	trait Seller extends Person {
		void sell() {		
			println "selling..."
		}
	}
	
	class Broker implements Buyer, Seller {
		private String n
		
		String getName() {
			return n
		}
	}
}
