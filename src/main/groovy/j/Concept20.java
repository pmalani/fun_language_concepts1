package j;

public class Concept20 {
	public static void main(String[] args) {
		Person p = new Worker();
		Factory factory = new Factory();
		factory.makeThemWork(p);
	}
	
	static class Factory {
		void makeThemWork(Person p) {
			System.out.println("make the person work");
		}
		
		void makeThemWork(Worker w) {
			System.out.println("make the worker work");
		}
	}

	static class Person {
	}
	
	static class Worker extends Person {
	}
}
