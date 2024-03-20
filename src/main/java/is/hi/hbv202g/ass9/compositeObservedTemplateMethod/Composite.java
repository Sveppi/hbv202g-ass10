package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * The `Composite` class is an abstract class that represents a composite math expression.
 * It implements the `MathExpression` interface and the `Observer` interface.
 * 
 * A composite math expression is composed of multiple sub-expressions, which can be either
 * composite expressions or leaf expressions. It provides methods to add and remove sub-expressions,
 * as well as retrieve the list of children sub-expressions.
 * 
 * The `Composite` class also acts as an observer, observing changes in a `NumberLeaf` object.
 * When the `NumberLeaf` object is updated, the `Composite` class adds it to the list of children
 * sub-expressions and updates the last observed result.
 * 
 * This class is meant to be extended by concrete composite classes that define their own
 * implementation of the `createNumberLeaf` method.
 */
public abstract class Composite implements MathExpression, Observer {

    /**
     * The list of child MathExpression components.
     */
    protected List<MathExpression> children = new ArrayList<MathExpression>();

    /**
     * The last observed result.
     */
    protected int lastObservedResult;

    /**
     * The NumberLeaf object associated with this composite.
     */
    protected NumberLeaf number;

    /**
     * Constructs a new Composite object.
     * It creates a NumberLeaf object and attaches itself as an observer to it.
     */
    public Composite() {
        number = createNumberLeaf();
        number.attach(this);
    }

    /**
     * Creates a NumberLeaf object.
     * Subclasses must implement this method to create the appropriate NumberLeaf object.
     *
     * @return the created NumberLeaf object.
     */
    protected abstract NumberLeaf createNumberLeaf();

    /**
     * Adds a MathExpression component to the composite.
     *
     * @param component the MathExpression component to add.
     */
    public void add(MathExpression component){
        children.add(component);
    }

    /**
     * Removes a MathExpression component from the composite.
     *
     * @param component the MathExpression component to remove.
     */
    public void remove(MathExpression component) {
        children.remove(component);
    }

    /**
     * Returns the list of child MathExpression components.
     *
     * @return the list of child MathExpression components.
     */
    public List<MathExpression> getChildren() {
        return children;
    }

    /**
     * Updates the composite when the observed NumberLeaf object changes.
     * It adds the NumberLeaf object to the children list, updates the last observed result,
     * and prints the last observed result to the standard error stream.
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
     * Returns the last observed result.
     *
     * @return the last observed result.
     */
    public int getLastObservedResult() {
        return lastObservedResult;
    }

}
