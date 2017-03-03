package uk.ac.york.modules.testing.group;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ EquationPanelTest.class, EquationsViewTest.class, EquationTest.class, FirstOrderEquationTest.class,
		FractionEquationTest.class, SinusBasedEquationTest.class })
public class AllTests {

}
