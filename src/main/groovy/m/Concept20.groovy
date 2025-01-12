package m

// Groovy does have double dispatch
class Concept20 {
	static void main(String[] args) {
		Person p = new Worker()
		Factory factory = new Factory()
		factory.makeThemWork(p)
	}
}

class Factory {
	void makeThemWork(Person p) {
		println "make the person work"
	}
	
	void makeThemWork(Worker w) {
		println "make the worker work"
	}
}

class Person {
}

class Worker extends Person {
}