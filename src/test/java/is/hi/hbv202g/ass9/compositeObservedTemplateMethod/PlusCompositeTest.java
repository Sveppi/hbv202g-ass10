package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is a test class for the PlusComposite class.
 * It contains test methods to verify the functionality of the PlusComposite class.
 */
public class PlusCompositeTest {

	private PlusComposite plusComposite;
	
	/**
	 * Creates a new PlusComposite object before each test method is executed.
	 */
	@Before
	public void createPlusComposite() {
		plusComposite = new PlusComposite();
	}
	
	/**
	 * Tests an empty PlusComposite object.
	 * It asserts that an empty PlusComposite should return 0.
	 */
	@Test
	public void testEmptyPlusComposite() {
		assertEquals("An empty plus composite should return 0", 0, plusComposite.getResult());
	}
	
	/**
	 * Tests a PlusComposite object with only one element.
	 * It asserts that a PlusComposite consisting only of one leaf with value 2 should return 2.
	 */
	@Test
	public void testOneElementPlusComposite() {
		NumberLeaf number2 = new NumberLeaf(2);

		plusComposite.add(number2);
		assertEquals("A plus composite consisting only of one leaf with value 2 should return 2",
				2, plusComposite.getResult());
	}

	/**
	 * Tests a PlusComposite object with two elements.
	 * It asserts that a PlusComposite consisting of leafs with values 1 and 2 should return 3.
	 */
	@Test
	public void testTwoElementPlusComposite() {
		NumberLeaf number1 = new NumberLeaf(1);
		NumberLeaf number2 = new NumberLeaf(2);

		plusComposite.add(number1);
		plusComposite.add(number2);
		assertEquals("A plus composite consisting of leafs with values 1 and 2 should return 3",
				3, plusComposite.getResult());
	}

	/**
	 * Tests a nested PlusComposite object.
	 * It asserts that a PlusComposite consisting of two further PlusComposites,
	 * each consisting of leafs with values 1 and 2, should return (1+2)+(1+2)=6.
	 */
	@Test
	public void testNestedPlusComposite() {
		NumberLeaf number1 = new NumberLeaf(1);
		NumberLeaf number2 = new NumberLeaf(2);

		plusComposite.add(number1);
		plusComposite.add(number2);

		PlusComposite plusComposite2 = new PlusComposite();
		plusComposite2.add(plusComposite);
		plusComposite2.add(plusComposite);

		assertEquals("A plus composite consisting two further plus composites, each consisting of leafs with values " +
				"1 and 2 should return (1+2)+(1+2)=6", 6, plusComposite2.getResult());
	}

}