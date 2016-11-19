package m

class Concept110_4 {

	trait Border {
		int getXCoordinate() {
			return 0
		}
	}

	trait Button {
		int getXCoordinate() {
			return 1
		}
	}

	static class BorderedButton1 implements Border, Button {
		// what is the value of get X Coordinate() ?
	}

	static class BorderedButton2 implements Button, Border {
		// what is the value of get X Coordinate() ?
	}
}
