package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * This class represents a test suite that includes all the test classes for the composite observed template method pattern.
 * It is responsible for running all the test cases in the suite.
 */
@RunWith(Suite.class)
@SuiteClasses({ MixedCompositeObserverTest.class, MultiplyCompositeObserverTest.class, MultiplyCompositeTest.class,
		NumberLeafObservedTest.class, NumberLeafTest.class, PlusCompositeObserverTest.class, PlusCompositeTest.class })
public class Alltests {
}
