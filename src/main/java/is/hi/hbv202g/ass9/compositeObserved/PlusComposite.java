package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a composite math expression that performs addition.
 * Implements the MathExpression interface and the Observer interface.
 */
public class PlusComposite implements MathExpression, Observer {
    
    private List<MathExpression> children = new ArrayList<MathExpression>();
    private int lastObservedResult;
    private NumberLeaf number;

    /**
     * Constructs a PlusComposite object with an initial value of 0.
     * Attaches a NumberLeaf object to observe changes.
     */
    public PlusComposite() {
        number = new NumberLeaf(0);
        number.attach(this);
    }
    
    /**
     * Adds a MathExpression component to the list of children.
     * @param component The MathExpression component to add.
     */
    public void add(MathExpression component){
        children.add(component);
    }

    /**
     * Removes a MathExpression component from the list of children.
     * @param component The MathExpression component to remove.
     */
    public void remove(MathExpression component) {
        children.remove(component);
    }

    /**
     * Returns the list of children MathExpressions.
     * @return The list of children MathExpressions.
     */
    public List<MathExpression> getChildren() {
        return children;
    }

    /**
     * Calculates and returns the result of the addition operation on all children MathExpressions.
     * @return The result of the addition operation.
     */
    @Override
    public int getResult() {
        int result = 0;
        for (MathExpression child : children) {
            result += child.getResult();
        }
        return result;
    }

    /**
     * Updates the PlusComposite object when the observed NumberLeaf object changes.
     */
    @Override
    public void update() {
        if (number != null) {
            children.add(number);
            lastObservedResult = getResult();
            System.err.println(lastObservedResult);
        }
    }

    /**
     * Returns the last observed result of the PlusComposite object.
     * @return The last observed result.
     */
    public int getLastObservedResult() {
        return lastObservedResult;
    }

}
