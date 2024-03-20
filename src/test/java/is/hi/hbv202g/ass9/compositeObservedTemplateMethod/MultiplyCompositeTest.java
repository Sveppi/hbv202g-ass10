package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains unit tests for the MultiplyComposite class.
 */
public class MultiplyCompositeTest {

	private MultiplyComposite multiplyComposite;

	/**
	 * Sets up the test fixture by creating a new instance of the MultiplyComposite class.
	 */
	@Before
	public void createMultiplyComposite() {
		multiplyComposite = new MultiplyComposite();
	}

	/**
	 * Test case for a multiply composite consisting of only one leaf.
	 * 
	 * This test verifies that a multiply composite consisting only of one leaf with value 2
	 * returns the expected result, which is 2.
	 */
	@Test
	public void testOneElementMultiplyComposite() {

		NumberLeaf number2 = new NumberLeaf(2);

		multiplyComposite.add(number2);
		assertEquals("A multiply composite consisting only of one leaf with value 2 should return 2",
				2, multiplyComposite.getResult());
	}

	/**
	 * Test case for a multiply composite with two elements.
	 * 
	 * This test verifies that a multiply composite consisting of two leafs with values 2 and 4
	 * correctly returns the expected result of 8.
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
	 * Test case for the nested multiply composite.
	 * 
	 * This test verifies that a multiply composite consisting of two further multiply composites, each consisting of leafs
	 * with values 2 and 4, returns the expected result.
	 * 
	 * The expected result is calculated as follows:
	 *   - The first multiply composite: 2 * 4 = 8
	 *   - The second multiply composite: 8 * 8 = 64
	 * 
	 * If the actual result matches the expected result, the test passes.
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
