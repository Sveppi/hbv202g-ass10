package is.hi.hbv202g.ass9.compositeObserved;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains unit tests for the MultiplyComposite class.
 */
public class MultiplyCompositeTest {

	private MultiplyComposite multiplyComposite;

	/**
	 * Creates an instance of MultiplyComposite before each test case.
	 */
	@Before
	public void createMultiplyComposite() {
		multiplyComposite = new MultiplyComposite();
	}

	/**
	 * Tests the behavior of MultiplyComposite when it contains only one element.
	 * It adds a NumberLeaf with value 2 to the MultiplyComposite and asserts that the result is 2.
	 */
	@Test
	public void testOneElementMultiplyComposite() {
		NumberLeaf number2 = new NumberLeaf(2);

		multiplyComposite.add(number2);

		assertEquals("A multiply composite consisting only of one leaf with value 2 should return 2",
				2, multiplyComposite.getResult());
	}

	/**
	 * Tests the behavior of MultiplyComposite when it contains two elements.
	 * It adds NumberLeafs with values 2 and 4 to the MultiplyComposite and asserts that the result is 8.
	 */
	@Test
	public void testTwoElementMultiplyComposite() {
		NumberLeaf number2 = new NumberLeaf(2);
		NumberLeaf number4 = new NumberLeaf(4);

		multiplyComposite.add(number2);
		multiplyComposite.add(number4);

		assertEquals("A multiply composite consisting of leafs with values 2 and 4 should return 8",
				8, multiplyComposite.getResult());
	}

	/**
	 * Tests the behavior of MultiplyComposite when it contains nested MultiplyComposites.
	 * It adds NumberLeafs with values 2 and 4 to the MultiplyComposite, then creates a new MultiplyComposite
	 * and adds the original MultiplyComposite twice to it. It asserts that the result is 64.
	 */
	@Test
	public void testNestedMultiplyComposite() {
		NumberLeaf number2 = new NumberLeaf(2);
		NumberLeaf number4 = new NumberLeaf(4);

		multiplyComposite.add(number2);
		multiplyComposite.add(number4);

		MultiplyComposite multiplyComposite2 = new MultiplyComposite();
		multiplyComposite2.add(multiplyComposite);
		multiplyComposite2.add(multiplyComposite);

		assertEquals("A multiply composite consisting two further multiply composites, each consisting of leafs with " +
				"values 2 and 4 should return (2*4)*(2*4)=64", 64, multiplyComposite2.getResult());
	}
}
