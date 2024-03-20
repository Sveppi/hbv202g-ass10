package is.hi.hbv202g.ass9.compositeObserved;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains unit tests for the PlusCompositeObserver class.
 */
public class PlusCompositeObserverTest {

	private PlusComposite plusComposite;

	/**
	 * Sets up the test fixture by creating a new instance of PlusComposite.
	 */
	@Before
	public void createPlusComposite() {
		plusComposite = new PlusComposite();
	}

	/**
	 * Test case for the scenario where the PlusCompositeObserver has only one element.
	 * It verifies that the PlusCompositeObserver correctly stores the value of the observed leaf.
	 */
	@Test
	public void testOneElementPlusCompositeObserver() {
		NumberLeaf number1 = new NumberLeaf(1);
		plusComposite.add(number1);

		plusComposite.update(); // This will cause stuff printed on the screen: this is not tested.

		assertEquals("An observing plus composite should store in its lastObservedField the value 1 to which the observed " +
				"leaf was set", 1, plusComposite.getLastObservedResult());
	}

}
