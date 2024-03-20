package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a composite math expression that multiplies its children together.
 */
public class MultiplyComposite implements MathExpression {

    private List<MathExpression> children = new ArrayList<MathExpression>();

    /**
     * Adds a child math expression to this composite.
     *
     * @param component the math expression to add
     */
    public void add(MathExpression component){
        children.add(component);
    }

    /**
     * Removes a child math expression from this composite.
     *
     * @param component the math expression to remove
     */
    public void remove(MathExpression component) {
        children.remove(component);
    }

    /**
     * Returns the list of children math expressions in this composite.
     *
     * @return the list of children math expressions
     */
    public List<MathExpression> getChildren() {
        return children;
    }

    /**
     * Calculates and returns the result of multiplying all the children math expressions together.
     *
     * @return the result of the multiplication
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
