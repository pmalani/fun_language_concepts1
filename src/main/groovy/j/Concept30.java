package j;

import java.util.List;

public class Concept30 {
	static class Person {
	}
	
	static class Worker extends Person {
	}
		
	static class Converter {
		void convert(Person person, Worker w) {
		}
		
		void convert(List<Person> persons, List<Worker> workers) {
		}
	}

	static class Club {
		// values is producer
		void addMembers(List<? extends Person> values) {
			for (Person person : values) {
				System.out.println(person);
			}
		}		
	}
	
	static class Factory {
		// values is consumer
		void collectNew(List<? super Person> values) {
//			values.add(new Object());
			values.add(new Person());
			values.add(new Worker());
		}
	}
	
}
