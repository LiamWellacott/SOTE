package uk.ac.york.modules.testing.group;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uk.ac.york.modules.testing.EquationsView;

public class EquationsViewTest {
	
	EquationsView ev;
	
	@Before 
	public void pre() {
		
	}
	
	@Test
	public void testEquationsView() {
		ev = new EquationsView();
	}

	@Test
	public void testMain() {
		ev = new EquationsView();
		EquationsView.main(new String[] {});
		EquationsView.main(new String[] {"Help", "me"});
		EquationsView.main(new String[] {"Help"});
		EquationsView.main(new String[] {"FirstOrder"});
		EquationsView.main(new String[] {"Sinus"});
		EquationsView.main(new String[] {"Fraction"});
		EquationsView.main(new String[] {"SecondOrder"});
	}
}
