package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a composite math expression that multiplies its child expressions.
 * Implements the MathExpression interface and the Observer interface.
 */
public class MultiplyComposite implements MathExpression, Observer {

    private List<MathExpression> children = new ArrayList<MathExpression>();
    private int lastObservedResult;
    private NumberLeaf number;

    /**
     * Constructs a new MultiplyComposite object.
     * Initializes the number leaf with a value of 1 and attaches itself as an observer.
     */
    public MultiplyComposite() {
        number = new NumberLeaf(1);
        number.attach(this);
    }

    /**
     * Adds a child math expression to this composite.
     * @param component The math expression to add.
     */
    public void add(MathExpression component){
        children.add(component);
    }

    /**
     * Removes a child math expression from this composite.
     * @param component The math expression to remove.
     */
    public void remove(MathExpression component) {
        children.remove(component);
    }

    /**
     * Returns the list of child math expressions.
     * @return The list of child math expressions.
     */
    public List<MathExpression> getChildren() {
        return children;
    }

    /**
     * Calculates and returns the result of multiplying all child expressions.
     * @return The result of multiplying all child expressions.
     */
    @Override
    public int getResult() {
        int result = 1;
        for (MathExpression child : children) {
            result *= child.getResult();
        }
        return result;
    }

    /**
     * Updates the composite when the observed number leaf changes.
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
     * Returns the last observed result of the composite.
     * @return The last observed result of the composite.
     */
    public int getLastObservedResult() {
        return lastObservedResult;
    }

}
