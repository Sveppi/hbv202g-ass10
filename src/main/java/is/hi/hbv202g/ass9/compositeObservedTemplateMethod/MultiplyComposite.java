package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

/**
 * Represents a composite math expression that multiplies the results of its children.
 * Extends the abstract class Composite.
 */
public class MultiplyComposite extends Composite {

    /**
     * Creates a new instance of the MultiplyComposite class.
     */
    public MultiplyComposite() {
        // Implementation details
    }

    /**
     * Creates a new NumberLeaf instance with a default value of 1.
     * Overrides the createNumberLeaf method in the Composite class.
     *
     * @return The created NumberLeaf instance.
     */
    @Override
    protected NumberLeaf createNumberLeaf() {
        return new NumberLeaf(1);
    }

    /**
     * Calculates and returns the result of multiplying the results of all the children.
     * Overrides the getResult method in the Composite class.
     *
     * @return The result of the multiplication.
     */
    @Override
    public int getResult() {
        int result = 1;
        for (MathExpression child : children) {
            result *= child.getResult();
        }
        return result;
    }
}
