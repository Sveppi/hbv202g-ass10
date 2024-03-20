package is.hi.hbv202g.ass9.composite;

/**
 * Represents a leaf node in a mathematical expression tree that holds a single number.
 */
public class NumberLeaf implements MathExpression {

    private int number;

    /**
     * Constructs a new NumberLeaf object with the given number.
     *
     * @param number the number to be stored in the leaf node
     */
    public NumberLeaf(int number) {
        this.number = number;
    }

    /**
     * Returns the number stored in the leaf node.
     *
     * @return the number stored in the leaf node
     */
    public int getResult() {
        return number;
    }
    
}
