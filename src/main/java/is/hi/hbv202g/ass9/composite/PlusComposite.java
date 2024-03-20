package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a composite expression that performs addition.
 * Implements the MathExpression interface.
 */
public class PlusComposite implements MathExpression {
    
    private List<MathExpression> children = new ArrayList<MathExpression>();

    /**
     * Adds a MathExpression component to the composite.
     * @param component The MathExpression component to add.
     */
    public void add(MathExpression component){
        children.add(component);
    }

    /**
     * Removes a MathExpression component from the composite.
     * @param component The MathExpression component to remove.
     */
    public void remove(MathExpression component) {
        children.remove(component);
    }

    /**
     * Returns the list of MathExpression children in the composite.
     * @return The list of MathExpression children.
     */
    public List<MathExpression> getChildren() {
        return children;
    }

    /**
     * Calculates and returns the result of the addition operation on all the children.
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

}
