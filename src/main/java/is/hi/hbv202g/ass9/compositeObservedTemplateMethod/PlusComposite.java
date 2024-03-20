package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

/**
 * Represents a composite math expression that performs addition.
 * This class extends the abstract class Composite and implements the necessary methods.
 */
public class PlusComposite extends Composite {

    /**
     * Creates a new NumberLeaf object with an initial value of 0.
     * @return the created NumberLeaf object
     */
    @Override
    protected NumberLeaf createNumberLeaf() {
        return new NumberLeaf(0);
    }

    /**
     * Calculates and returns the result of the addition operation for all child expressions.
     * @return the result of the addition operation
     */
    @Override
    public int getResult() {
        int result = 0;
        for (MathExpression child : children) {
            result += child.getResult();
        }
        return result;
    }
}
