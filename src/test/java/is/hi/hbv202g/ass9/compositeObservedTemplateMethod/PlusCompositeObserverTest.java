package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is responsible for testing the PlusCompositeObserver class.
 */
public class PlusCompositeObserverTest {

	private PlusComposite plusComposite;

	/**
	 * Creates a new instance of PlusComposite and assigns it to the plusComposite field.
	 */
	@Before
	public void createPlusComposite() {
		plusComposite = new PlusComposite();
	}

	/**
	 * Tests the behavior of the PlusCompositeObserver when there is only one element in the composite.
	 * It adds a NumberLeaf with value 1 to the plusComposite and verifies that the lastObservedResult
	 * field of the plusComposite is set to 1 after calling the update method.
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
