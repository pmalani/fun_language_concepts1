package j;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import j.Concept110_5.BorderedButton;

import org.junit.Test;

public class Concept110_5Test {
	
	@Test
	public void test() {
		BorderedButton button = new BorderedButton();
		assertThat(button.getXCoordinate(), is(0));
	}

}
