package j;

import java.util.Objects;

public class Concept90_1 {
	public void say(String name) {
		if (name.equals("Bart")) 
			System.out.println("Ay caramba!");
	}
	
	public void yoda(String name) {
		if ("Bart".equals(name)) 
			System.out.println("Ay caramba!");
	}
	
	public void util(String name) {
		if (Objects.equals(name, "Bart")) 
			System.out.println("Ay caramba!");
	}
}
