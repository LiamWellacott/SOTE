package uk.ac.york.modules.testing.group;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import uk.ac.york.modules.testing.Equation;
import uk.ac.york.modules.testing.FirstOrderEquation;

public class EquationTest {

	private Equation e;
	
	private class DummyEquation extends Equation {
		public DummyEquation() {
			
		}
	}
	
	@Before
	public void pre() {
		e = new FirstOrderEquation(1,1);
	}
	
	@Test
	public void testCreateEquationFromType() {
		
		// call function using each type (correct data)
		e = Equation.createEquationFromType(FirstOrderEquation.class);
		assertNotNull(e);
		
		
		// call function using incorrect data
		e = Equation.createEquationFromType(FirstOrderEquation.class);
	}

	@Test
	public void testToString() {
		e = new DummyEquation();
	    
		assertNotNull(e.toString());
	}

	@Test
	public void testOf() {
		e = new DummyEquation();
	   // y = 0
	   assertTrue(0 == e.of(0));
	}

}
