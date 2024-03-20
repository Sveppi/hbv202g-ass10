package is.hi.hbv202g.ass9.compositeObserved;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * This class contains unit tests for the MixedCompositeObserver class.
 */
public class MixedCompositeObserverTest {

	/**
	 * Test case for the mixed plus multiply composites observer.
	 * 
	 * This test creates a composite structure with a plus composite and a multiply composite.
	 * It attaches number leaves to the composites and sets the value of one of the leaves.
	 * The test then asserts that the last observed result of the multiply composite is correct.
	 * 
	 * The composite structure is as follows:
	 * - PlusComposite: (1 + 2)
	 * - MultiplyComposite: (4 * (1 + 2))
	 * 
	 * The test sets the value of the first number leaf to 3, resulting in the following expression:
	 * (3 + 2) * 4 = 20
	 * 
	 * The test asserts that the last observed result of the multiply composite is 20.
	 */
	@Test
	public void testMixedPlusMultiplyCompositesObserver() {
		NumberLeaf number1 = new NumberLeaf(1);
		NumberLeaf number2 = new NumberLeaf(2);
		NumberLeaf number4 = new NumberLeaf(4);

		PlusComposite plusComposite = new PlusComposite();
		plusComposite.add(number1);
		plusComposite.add(number2);

		MultiplyComposite multiplyComposite = new MultiplyComposite();
		multiplyComposite.add(number4);
		multiplyComposite.add(plusComposite);

		number1.attach(multiplyComposite);
		number2.attach(multiplyComposite);
		number4.attach(multiplyComposite);

		number1.setValue(3); // This will cause stuff printed on the screen: this is not tested.
	
		assertEquals("Having an expression (1+2)*4 and the observed leave with value 1 is set to 3, i.e. (3+2)*4, " +
				"the lastObserverdValue should return 20", 20, multiplyComposite.getLastObservedResult());
	}
}
