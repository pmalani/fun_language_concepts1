package j;

public class Concept110_5 {
	interface Border {
		default int getXCoordinate() {
			return 0;
		}
	}
	
	interface Button {
		default int getXCoordinate() {
			return 1;
		}
	}
	
	// does not compile
//	static class BorderedButton implements Border, Button {	}
	
	static class BorderedButton implements Border, Button {	
		public int getXCoordinate() {
			return Border.super.getXCoordinate();
		}		
	}
}
