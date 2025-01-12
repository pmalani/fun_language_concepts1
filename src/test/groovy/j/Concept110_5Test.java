package j;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import j.Concept110_5.BorderedButton;
import org.junit.jupiter.api.Test;

public class Concept110_5Test {
	
	@Test
	public void test() {
		BorderedButton button = new BorderedButton();
		assertThat(button.getXCoordinate(), is(0));
	}

}
