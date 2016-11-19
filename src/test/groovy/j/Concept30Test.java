package j;

import j.Concept30.Club;
import j.Concept30.Converter;
import j.Concept30.Factory;
import j.Concept30.Person;
import j.Concept30.Worker;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Concept30Test {
	private Person person;
	private Worker worker;
	
	private List<Object> objects;
	private List<Person> persons;
	private List<Worker> workers;

	@Before
	public void setup() {
		objects = new ArrayList<>();
		persons = new ArrayList<>();
		workers = new ArrayList<>();		
	}

	@Test
	public void invariant() {
		Converter converter = new Converter();
		converter.convert(person, worker);
		converter.convert(worker, new Worker());
		
		converter.convert(persons, workers);
		//converter.convert(workers, new ArrayList<Worker>());
	}
	
	@Test
	public void covariant() {
		Club club = new Club();
//		club.addMembers(objects);
		club.addMembers(persons);
		club.addMembers(workers);
	}
	
	@Test
	public void contravariant() {
		Factory factory = new Factory();
		factory.collectNew(objects);
		factory.collectNew(persons);
//		factory.collectNew(workers);
	}
	
}
