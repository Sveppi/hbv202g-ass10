package is.hi.hbv202g.ass9.compositeObserved;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains unit tests for the MultiplyCompositeObserver class.
 */
public class MultiplyCompositeObserverTest {

	private MultiplyComposite multiplyComposite;

	/**
	 * Creates a new instance of the MultiplyComposite class before each test.
	 */
	@Before
	public void createMultiplyComposite() {
		multiplyComposite = new MultiplyComposite();
	}

	/**
	 * Test case for the scenario where a single element is added to the multiply composite observer.
	 * The test verifies that the multiply composite observer correctly stores the last observed result.
	 * This test does not verify the printing to the screen.
	 */
	@Test
	public void testOneElementMultiplyCompositeObserver() {
		NumberLeaf number2 = new NumberLeaf(2);
		multiplyComposite.add(number2);

		multiplyComposite.update(); // This will cause stuff printed on the screen: this printing to screen is not tested by any of the JUnit tests.

		assertEquals("An observing multiply composite should store in its lastObservedField the value 2 to which the observed " +
				"leaf was set", 2, multiplyComposite.getLastObservedResult());
	}
}
