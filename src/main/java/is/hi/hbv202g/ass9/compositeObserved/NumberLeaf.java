package is.hi.hbv202g.ass9.compositeObserved;

/**
 * Represents a leaf node in a composite mathematical expression.
 * A leaf node contains a single number value.
 */
public class NumberLeaf extends Observable implements MathExpression {

    private int number;

    /**
     * Constructs a new NumberLeaf object with the specified number value.
     *
     * @param number the number value of the leaf node
     */
    public NumberLeaf(int number) {
        this.number = number;
    }

    /**
     * Returns the number value of the leaf node.
     *
     * @return the number value
     */
    public int getResult() {
        return number;
    }

    /**
     * Sets the number value of the leaf node and notifies the observers.
     *
     * @param number the new number value
     */
    public void setValue(int number) {
        this.number = number;
        notifyObservers();
    }
    
}
