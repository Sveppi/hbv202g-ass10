package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains unit tests for the MultiplyCompositeObserver class.
 */
public class MultiplyCompositeObserverTest {

	private MultiplyComposite multiplyComposite;

	/**
	 * Creates a new instance of MultiplyComposite before each test.
	 */
	@Before
	public void createMultiplyComposite() {
		multiplyComposite = new MultiplyComposite();
	}

	/**
	 * Tests the behavior of a MultiplyCompositeObserver with only one element.
	 * It verifies that the last observed result is correctly stored.
	 */
	@Test
	public void testOneElementMultiplyCompositeObserver() {

		NumberLeaf number2 = new NumberLeaf(2);
		multiplyComposite.add(number2);

		multiplyComposite.update(); // This will cause stuff printed on the screen: this is not tested.

		assertEquals("An observing multiply composite should store in its lastObservedField the value 2 to which the observed " +
				"leaf was set", 2, multiplyComposite.getLastObservedResult());
	}
}