package is.hi.hbv202g.ass9.composite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * This class represents a test suite that runs all the test classes for the composite pattern implementation.
 */
@RunWith(Suite.class)
@SuiteClasses({ MixedCompositeTest.class, MultiplyCompositeTest.class, NumberLeafTest.class, PlusCompositeTest.class })
public class Alltests {
}
