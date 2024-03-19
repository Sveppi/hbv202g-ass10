package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite implements MathExpression, Observer {

    protected List<MathExpression> children = new ArrayList<MathExpression>();
    protected int lastObservedResult;
    protected NumberLeaf number;

    public Composite() {
        number = createNumberLeaf();
        number.attach(this);
    }

    protected abstract NumberLeaf createNumberLeaf();

    public void add(MathExpression component){
        children.add(component);
    }

    public void remove(MathExpression component) {
        children.remove(component);
    }

    public List<MathExpression> getChildren() {
        return children;
    }

    @Override
    public void update() {
        if (number != null) {
            children.add(number);
            lastObservedResult = getResult();
            System.err.println(lastObservedResult);
        }
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }

}
