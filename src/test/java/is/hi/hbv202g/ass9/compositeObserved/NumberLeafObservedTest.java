package is.hi.hbv202g.ass9.compositeObserved;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is a test class for the NumberLeaf class, which implements the Observer interface.
 * It tests the functionality of attaching an observer to a NumberLeaf object and updating the observer
 * when the value of the NumberLeaf object changes.
 */
public class NumberLeafObservedTest implements Observer {

	private int lastObservedResult;
	private NumberLeaf number1;

	/**
	 * Creates an instance of NumerLeaf, initialized to 1 before each test case, as well as setting lastObservedResult to 0.
	 */
	@Before
	public void setUp() {
		lastObservedResult=0; // This value here must be different than the one set in the next line
		number1 = new NumberLeaf(1);
	}

	/**
	 * Test case for the NumberLeaf class.
	 * It verifies that the values are updated correctly after observer is attached.
	 */
	@Test
	public void testAttachAndUpdateAfterSetValue() {
		number1.attach(this);
		number1.setValue(3);

		assertEquals("A leaf observed by this testcase should call update method of this testcase after having " +
						"set value of this leaf to 3 and this leaf should returns this new value 3 when asked by the update method",
				3, lastObservedResult);
	}

	@Override
	public void update() { // We need to provide this method according to the Observer interface that this test class implements
		lastObservedResult=number1.getResult(); // If we get called we store the value in lastObservedResult so that the test case above can assert on it
	}
}