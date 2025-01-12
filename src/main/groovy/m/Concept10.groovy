package m

class Concept10 {
	static void main(String[] args) {
		List ducks = [new Duck(), new RubberDuck()]
		for (duck in ducks) {
			println duck.say();
		}
	}
}

class Duck {
	String say() {
		return "quack";
	}
}

class RubberDuck {
	String say() {
		return "really?";
	}
}