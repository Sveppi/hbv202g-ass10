package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * This class contains unit tests for the NumberLeaf class.
 */
public class NumberLeafTest {

	/**
	 * Tests the NumberLeaf constructor and the getResult method.
	 */
	@Test
	public void testNumberLeaf() {
		NumberLeaf number1 = new NumberLeaf(1);

		assertEquals("A leaf with value 1 should return 1", 1, number1.getResult());

		NumberLeaf number2 = new NumberLeaf(2);

		assertEquals("A leaf with value 2 should return 2", 2, number2.getResult());
	}

}

