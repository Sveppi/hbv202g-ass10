package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

/**
 * Represents a leaf node in a mathematical expression tree that holds a single number.
 * Implements the MathExpression interface and extends the Observable class to support observer pattern.
 */
public class NumberLeaf extends Observable implements MathExpression {

    private int number;

    /**
     * Constructs a NumberLeaf object with the specified number.
     *
     * @param number the value of the number
     */
    public NumberLeaf(int number) {
        this.number = number;
    }

    /**
     * Returns the value of the number held by this NumberLeaf.
     *
     * @return the value of the number
     */
    public int getResult() {
        return number;
    }

    /**
     * Sets the value of the number held by this NumberLeaf and notifies the observers.
     *
     * @param number the new value of the number
     */
    public void setValue(int number) {
        this.number = number;
        notifyObservers();
    }
    
}
