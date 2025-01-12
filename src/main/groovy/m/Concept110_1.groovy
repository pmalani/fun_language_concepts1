package m

class Concept110_1 {

	class Person {
		String name
	}
	
	class Buyer extends Person {
		// does buyer have name?
	}
	
	class Seller extends Person {
		// does seller have name?
	}

	// Multiple Inheritance / Diamond Problem
	// How many name does broker have?	
//	class Broker extends Buyer, Seller { }
	
	class Component {
		int xCoordinate
	}
	
	class Border extends Component {
		
	}
	
	class Button extends Component {
		
	}
	
	// Multiple Inheritance / Diamond Problem
	// How many xCoordinate does bordered button have?	
//	class BorderedButton extends Border, Button {}
}
