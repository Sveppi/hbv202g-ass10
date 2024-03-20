package is.hi.hbv202g.ass9;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * This class represents a test suite that includes all the test classes for the project.
 * It is used to run multiple test classes together.
 */
@RunWith(Suite.class)
@SuiteClasses({ is.hi.hbv202g.ass9.composite.Alltests.class,
		is.hi.hbv202g.ass9.compositeObserved.Alltests.class,
		is.hi.hbv202g.ass9.compositeObservedTemplateMethod.Alltests.class })
public class Alltests {
}
