package is.hi.hbv202g.ass9.composite;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains unit tests for the MultiplyComposite class.
 */
public class MultiplyCompositeTest {

    private MultiplyComposite multiplyComposite;

    /**
     * Creates a new MultiplyComposite object before each test.
     */
    @Before
    public void createMultiplyComposite() {
        multiplyComposite = new MultiplyComposite();
    }

    /**
     * Tests the getResult() method of MultiplyComposite when it contains only one leaf.
     */
    @Test
    public void testOneElementMultiplyComposite() {
        NumberLeaf number2 = new NumberLeaf(2);

        multiplyComposite.add(number2);

        assertEquals("A multiply composite consisting only of one leaf with value 2 should return 2",
                2, multiplyComposite.getResult());
    }

    /**
     * Tests the getResult() method of MultiplyComposite when it contains two leafs.
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
     * Tests the getResult() method of MultiplyComposite when it contains nested MultiplyComposite objects.
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
